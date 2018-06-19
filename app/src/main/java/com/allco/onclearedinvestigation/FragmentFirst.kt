package com.allco.onclearedinvestigation

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentFirst : Fragment() {

    companion object {
        private const val TAG = "FragmentFirst_lll"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        ViewModelProviders.of(this).get(ViewModelFirst::class.java)

        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "onDestroy")
    }
}
