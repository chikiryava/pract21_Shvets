package com.bignerdranch.android.criminalintent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val currentFragment=supportFragmentManager.findFragmentById(R.id.Fragment_container)
        if(currentFragment==null)
        {
            val fragment=CrimeFragment()
            supportFragmentManager.beginTransaction().add(R.id.Fragment_container,fragment).commit()
        }

    }
}