package com.hzz.hellokotlin.function

import android.os.Bundle
import android.util.Log
import com.hzz.hellokotlin.R
import com.hzz.hellokotlin.function.base.BaseActivity
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var client = OkHttpClient();
        var request = Request.Builder()
                .url("https://gank.io/feed")
                .build();
        var thread = Thread(Runnable {
            var response = client.newCall(request).execute();
            Log.i("msg", response.body().string())
        })
        thread.start()

    }
}
