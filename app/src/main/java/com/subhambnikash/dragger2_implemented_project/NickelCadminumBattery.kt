package com.subhambnikash.dragger2_implemented_project

import android.util.Log
import javax.inject.Inject

class NickelCadminumBattery @Inject constructor() :BatteryManager {
    override fun checkBatteryPercentage() {
        Log.d(LogData.TAG, "checkBatteryPercentage: charging from nickel battery ")
    }
}