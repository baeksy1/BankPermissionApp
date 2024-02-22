package com.crepass.ppcbank_dev.application

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.crepass.ppcbank_dev.R

abstract class BaseFragment: Fragment() {


    private var backKeyPressedTime:Long=0
    abstract var isBackAvailable : Boolean

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val callback = requireActivity().onBackPressedDispatcher.addCallback(this){
            if(System.currentTimeMillis()>backKeyPressedTime + 2000){
                Toast.makeText(context, R.string.txt_pressed_back,Toast.LENGTH_SHORT).show()
                backKeyPressedTime = System.currentTimeMillis()
                return@addCallback
            }else{
                if(isBackAvailable){
                    findNavController().popBackStack()
                }else{
                    activity?.finish()
                }
            }
        }
        callback.isEnabled=true

    }

}