package com.subhambnikash.dragger2_implemented_project

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(batteryManager: BatteryManager,memoryCard: MemoryCard,simCard: SimCard) {

    init {
        batteryManager.checkBatteryPercentage()
        memoryCard.checkSpace()
        simCard.setUpSimCard()
    }

    fun doCalling(){
        Log.d(LogData.TAG, "doCalling: calling")
    }

}