package com.subhambnikash.dragger2_implemented_project

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class BatteryMoule {
    @Binds
  abstract  fun getNickelBattery(nickelCadminumBattery: NickelCadminumBattery):BatteryManager


}