package com.subhambnikash.dragger2_implemented_project

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    init {
        Log.d(LogData.TAG, "service Available")
    }
}