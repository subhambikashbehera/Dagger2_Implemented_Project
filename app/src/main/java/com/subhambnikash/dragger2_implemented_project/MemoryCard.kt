package com.subhambnikash.dragger2_implemented_project

import android.util.Log
import javax.inject.Inject

class MemoryCard {
    init {
        Log.d(LogData.TAG, ":memory initializing")
    }

    fun checkSpace(){
        Log.d(LogData.TAG, "checkSpace: spaceAvailable")
    }
}