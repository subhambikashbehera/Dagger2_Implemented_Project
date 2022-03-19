package com.subhambnikash.dragger2_implemented_project

import android.util.Log
import dagger.Module
import dagger.Provides


@Module
class ModuleMemoryCard(val size:Int) {
    @Provides
    fun provideMemoryCard():MemoryCard{
        Log.d(LogData.TAG, "provideMemoryCard: $size")
        return MemoryCard()
    }
}