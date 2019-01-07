package com.lin.app.vasdolly

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.leon.channel.helper.ChannelReaderUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val channel = ChannelReaderUtil.getChannel(this@MainActivity)
            Toast.makeText(this@MainActivity, channel, Toast.LENGTH_LONG).show()

        }, 5000)
    }
}
