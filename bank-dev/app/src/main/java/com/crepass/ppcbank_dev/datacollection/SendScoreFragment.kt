package com.crepass.ppcbank_dev.datacollection

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.getBinding
import androidx.navigation.fragment.findNavController
import com.crepass.ppcbank_dev.R
import com.crepass.ppcbank_dev.application.BaseFragment
import com.crepass.ppcbank_dev.databinding.FragmentPermissionAgreementBinding
import com.crepass.ppcbank_dev.databinding.FragmentSendscoreBinding

class SendScoreFragment() :BaseFragment() {
    private lateinit var binding: FragmentSendscoreBinding
    override var isBackAvailable: Boolean = false
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=
            DataBindingUtil.inflate(inflater, R.layout.fragment_sendscore,container,false)
        val imageView = binding.loding
        val animationDrawable=imageView.drawable as AnimationDrawable
        animationDrawable.start()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner=this



    }

}