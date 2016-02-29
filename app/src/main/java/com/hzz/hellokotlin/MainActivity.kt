package com.hzz.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = arrayListOf(1, 2, 3, 4);
        list.add(5);
        list.remove(3);
        for (item in list) {
            println(item);
        }
    }
}
