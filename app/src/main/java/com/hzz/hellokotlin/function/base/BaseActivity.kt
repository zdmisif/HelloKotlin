package com.hzz.hellokotlin.function.base

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by ewhale on 2016/3/3.
 */
open class BaseActivity : AppCompatActivity() {
    //开启activity
    fun start(context: Context) {
        var i = Intent(context, javaClass);
        context.startActivity(i);
    }

    fun start(context: Context, bundle: Bundle) {
        var i = Intent(context, javaClass);
        i.putExtras(bundle);
        context.startActivity(i);
    }
}