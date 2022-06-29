package com.mainli.demo.trace;

import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;


public final class TraceProcess {
    private static long sProcessStartTime = -1;
    private static TracePrint sTracePrint = null;

    public static void setTracePrint(TracePrint tracePrint) {
        sTracePrint = tracePrint;
    }

    public static long getProcessElapsedTime() {
        return SystemClock.elapsedRealtime() - getCurrentProcessStartTime();
    }


    public static long getCpuElapsedTime() {
        return SystemClock.elapsedRealtime();
    }

    public static long getCurrentProcessStartTime() {
        if (sProcessStartTime > -1) {
            return sProcessStartTime;
        }
        return getProcessStartTimeByPid(Process.myPid());
    }

    /**
     * 获取进程启动时间
     * https://stackoverflow.com/questions/5552125/running-process-start-time/42195623#42195623
     */
    public static long getProcessStartTimeByPid(int pid) {
        final String path = "/proc/" + pid + "/stat";
        BufferedReader reader = null;
        FileReader in = null;
        String stats = null;
        try {
            in = new FileReader(path);
            reader = new BufferedReader(in);
            stats = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeIo(reader);
            closeIo(in);
        }
        if (stats == null) {
            return -1;
        }
        final int fieldStartTime = 20;
        try {
            String[] fields = stats.substring(stats.lastIndexOf(") ")).split(" ");
            long t = Long.parseLong((fields[20]));
            long tck = Os.sysconf(OsConstants._SC_CLK_TCK);
            return (t * 1000) / tck;
        } catch (Exception e) {
            //ignore
        }
        return -1;
    }

    private static void closeIo(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                //ignore
            }
        }
    }

    private static AtomicLong lastReportTime = new AtomicLong(0);
    private static AtomicInteger lastReportIndex = new AtomicInteger(0);

    public static void traceMethod(String method, String suffix) {
        if (sTracePrint != null) {
            long lastTime = lastReportTime.getAndSet(getProcessElapsedTime());
            long currentTime = lastReportTime.get();
            StringBuilder stringBuilder = new StringBuilder()   //
                    .append(lastReportIndex.getAndIncrement())  //
                    .append(',').append(method).append(suffix)  //
                    .append(",").append(currentTime - lastTime);

            sTracePrint.printTraceInfo(stringBuilder.toString());
        }
    }

    public static void traceMethodBegin(String method) {
        traceMethod(method, "_begin");
    }

    public static void traceMethodEnd(String method) {
        traceMethod(method, "_end");
    }

    public static void traceEnd() {
        if (sTracePrint != null) {
            StringBuilder stringBuilder = new StringBuilder()//
                    .append(lastReportIndex.getAndIncrement())//
                    .append(',').append("Total")//
                    .append(',').append(getProcessElapsedTime());
            sTracePrint.printTraceInfo(stringBuilder.toString());
            sTracePrint = null;
        }
    }
}




