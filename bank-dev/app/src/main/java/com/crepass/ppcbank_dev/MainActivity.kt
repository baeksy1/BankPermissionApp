package com.crepass.ppcbank_dev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.crepass.ppcbank_dev.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navHost : NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.lifecycleOwner=this
        navHost=supportFragmentManager.fragments.first() as NavHostFragment





        setContentView(R.layout.activity_main)


    }
}