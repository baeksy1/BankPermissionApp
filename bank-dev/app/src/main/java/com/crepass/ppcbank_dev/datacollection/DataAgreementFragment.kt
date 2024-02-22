package com.crepass.ppcbank_dev.datacollection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.crepass.ppcbank_dev.R
import com.crepass.ppcbank_dev.application.BaseFragment
import com.crepass.ppcbank_dev.databinding.FragmentDataAgreementBinding
import com.crepass.ppcbank_dev.databinding.FragmentPermissionAgreementBinding

class DataAgreementFragment() :BaseFragment(){
    private lateinit var binding: FragmentDataAgreementBinding
    override var isBackAvailable: Boolean = false
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=
            DataBindingUtil.inflate(inflater, R.layout.fragment_data_agreement,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner=this


        binding.btnSdScore.setOnClickListener{
            findNavController().navigate(R.id.action_dataAgreementFragment_to_dataCompleteFragment)
        }

    }

}