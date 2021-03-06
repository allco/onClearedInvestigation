package com.drivekitt.onclearedinvestigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.container, FragmentFirst()).commit()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "onDestroy")
    }

    fun onStartClicked(view: View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, FragmentSecond())
            .addToBackStack("second")
            .commit()
    }
}
