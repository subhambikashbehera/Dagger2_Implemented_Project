package com.subhambnikash.dragger2_implemented_project

import android.util.Log
import javax.inject.Inject

class BatteryManager @Inject constructor() {

    init {
        Log.d(LogData.TAG, "initialize battery: ")
    }

    fun checkBatteryPercentage(){
        Log.d(LogData.TAG, "checkBatteryPercentage: 100 ")
    }
}