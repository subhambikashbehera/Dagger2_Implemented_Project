package com.subhambnikash.dragger2_implemented_project

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ModuleMemoryCard::class,BatteryMoule::class])
interface ComponentName {

    fun inject(mainActivity: MainActivity)

}