package com.subhambnikash.dragger2_implemented_project

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor (serviceData:ServiceProvider) {
    init {
        Log.d(LogData.TAG, ":initialize simCard ")
    }

    fun setUpSimCard(){
        Log.d(LogData.TAG, "setUpSimCard: network Available")
    }
}