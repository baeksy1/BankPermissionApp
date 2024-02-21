package com.crepass.ppcbank_dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.crepass.ppcbank_dev.application.BaseFragment
import com.crepass.ppcbank_dev.databinding.FragmentHomeBinding

class HomeFragment: BaseFragment() {


    private lateinit var binding:FragmentHomeBinding
    override var isBackAvailable: Boolean = false
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        return super.onCreateView(inflater, container, savedInstanceState)
    }




}