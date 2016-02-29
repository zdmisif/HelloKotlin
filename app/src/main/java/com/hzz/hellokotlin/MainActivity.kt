package com.hzz.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val mKotlinTxt: TextView by lazy {
        findViewById(R.id.kotlin_txt) as TextView;
    }
    private val nullView: TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = arrayListOf(1, 2, 3, 4);
        list.add(5);
        list.remove(3);
        for (item in list) {
            println(item);
        }
        var javaClass = JavaClass()
        println(javaClass.name + " " + javaClass.id);
        javaClass.name = "ming";
        javaClass.id = 100;
        println(javaClass.name + " " + javaClass.id);
        var nullable: Int? = 0;
        var nonNullable: Int = 2;


        mKotlinTxt.setText("Kotlin");
        nullView?.setText("123");

    }
}
