package com.hzz.hellokotlin.function.auth

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.hzz.hellokotlin.R
import com.hzz.hellokotlin.function.MainActivity

class BootpageActivity : AppCompatActivity() {

    private final var DELAY_MILLIS: Long = 3000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bootpage)
        var handler: Handler = Handler();
        Handler().postDelayed(Runnable { gotoMain() }, DELAY_MILLIS);
    }

    fun gotoMain() {
        //        val intent = Intent(BootpageActivity@this,);
        //        startActivity(intent);
    }
}
