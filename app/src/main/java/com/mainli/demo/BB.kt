package com.mainli.demo

import android.util.Log


data class BB(val string: String, val int: Int) {}

fun aa() {
    val koltinConstructorParameters =
        AA.getKoltinConstructorParameters(MyIotApplianceListPayload::class.java)
    Log.println(Log.WARN, "Mainli", "aa: ${koltinConstructorParameters}")
}