package com.crepass.ppcbank_dev.intro

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.crepass.ppcbank_dev.MainActivity
import com.crepass.ppcbank_dev.R

class IntroActivity:AppCompatActivity() {

    private var handle:Handler?= Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_intro)

        handle?.postDelayed(run,2000)


    }
    private var run : Runnable = object : Runnable{
        override fun run() {

            val options = ActivityOptions.makeCustomAnimation(
                applicationContext,
                android.R.anim.fade_in,  // 새 액티비티 진입 시 사용할 애니메이션
                android.R.anim.fade_out    // 현재 액티비티 퇴장 시 사용할 애니메이션
            )
            var intent: Intent = Intent(this@IntroActivity, MainActivity::class.java)
            startActivity(intent,options.toBundle())
            finish()
        }

    }



}