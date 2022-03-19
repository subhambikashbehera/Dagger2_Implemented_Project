package com.subhambnikash.dragger2_implemented_project

import android.app.Application

class SmartPhoneApplication: Application() {
    lateinit var initDagger:ComponentName
    override fun onCreate() {
        super.onCreate()
        initDagger=initializeDagger()
    }
    private fun initializeDagger(): ComponentName =DaggerComponentName.builder().moduleMemoryCard(ModuleMemoryCard(100)).build()
}