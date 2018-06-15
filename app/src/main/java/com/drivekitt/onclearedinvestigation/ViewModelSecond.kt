package com.drivekitt.onclearedinvestigation

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.util.Log

class ViewModelSecond(application: Application) : AndroidViewModel(application) {

    companion object {
        private const val TAG = "ViewModelSecond"
    }

    init {
        Log.v(TAG, "Created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.v(TAG, "onCleared")
    }
}