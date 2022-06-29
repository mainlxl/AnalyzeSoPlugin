package com.mainli.demo;

import android.content.Context;
import android.util.Log;

import com.mainli.demo.trace.TracePrint;
import com.mainli.demo.trace.TraceProcess;

public class MyApplication extends android.app.Application implements TracePrint {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        TraceProcess.setTracePrint(this);
    }

    @Override
    public void printTraceInfo(String traceInfo) {
        Log.d("<Mainli>", traceInfo);
    }
}
