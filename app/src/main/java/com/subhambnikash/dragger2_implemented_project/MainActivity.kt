package com.subhambnikash.dragger2_implemented_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
   @Inject
    lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as SmartPhoneApplication).initDagger.inject(this)
        smartPhone.doCalling()

    }



}