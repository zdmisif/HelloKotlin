package com.hzz.hellokotlin.function.auth

import android.os.Bundle
import android.os.Handler
import com.hzz.hellokotlin.R
import com.hzz.hellokotlin.function.MainActivity
import com.hzz.hellokotlin.function.base.BaseActivity

class BootpageActivity : BaseActivity() {

    private var DELAY_MILLIS: Long = 3000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bootpage)
        var handler: Handler = Handler();
        Handler().postDelayed(Runnable { MainActivity().start(this) }, DELAY_MILLIS);
    }
}
