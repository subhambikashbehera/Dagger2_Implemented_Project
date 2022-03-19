package com.subhambnikash.dragger2_implemented_project

import dagger.Component

@Component(modules = [ModuleMemoryCard::class])
interface ComponentName {

    fun setUpPhone():SmartPhone

}