package com.crepass.ppcbank_dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.crepass.ppcbank_dev.application.BaseFragment
import com.crepass.ppcbank_dev.databinding.FragmentHomeBinding

class HomeFragment() : BaseFragment() {
    override var isBackAvailable: Boolean =false
    private lateinit var binding:FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner=this


        binding.nextLevelBtn.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_permissionAgreeFragment)
        }

    }


}