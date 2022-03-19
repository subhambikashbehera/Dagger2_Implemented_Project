package com.subhambnikash.dragger2_implemented_project

import dagger.Module
import dagger.Provides


@Module
class ModuleMemoryCard {
    @Provides
    fun provideMemoryCard():MemoryCard{
        return MemoryCard()
    }
}