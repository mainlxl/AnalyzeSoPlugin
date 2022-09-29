package com.mainli.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.knightboost.lancet.api.Origin;
import com.knightboost.lancet.api.Scope;
import com.knightboost.lancet.api.This;
import com.knightboost.lancet.api.annotations.Insert;
import com.knightboost.lancet.api.annotations.TargetClass;
import com.knightboost.lancet.api.annotations.TargetMethod;
import com.knightboost.lancet.api.annotations.Weaver;

import androidx.annotation.Nullable;

@Weaver
public class InsertTest {
    @Insert(mayCreateSuper = true)
    @TargetMethod(methodName = "onCreate")
    @TargetClass(value = "android.app.Activity", scope = Scope.LEAF)
    public void onCreate2(@Nullable Bundle savedInstanceState) {
        long begin = System.currentTimeMillis();
        Origin.callVoid();
        long end = System.currentTimeMillis();
        Activity activity = ((Activity) This.get());
        Log.e("insertTest", activity + " onCreate cost " + (end - begin) + " ms");
    }
}