package com.lin.walle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.meituan.android.walle.ChannelInfo;
import com.meituan.android.walle.WalleChannelReader;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 使用channelFile --channel配置
         */
        Log.e(getClass().getSimpleName(), WalleChannelReader.getChannel(getApplicationContext()));

        /**
         * 使用configFile --config.json配置
         */
        ChannelInfo channelInfo= WalleChannelReader.getChannelInfo(getApplicationContext());
        if (channelInfo != null) {
            String channel = channelInfo.getChannel();
            Map<String, String> extraInfo = channelInfo.getExtraInfo();
        }
        // 或者也可以直接根据key获取
//        String value = WalleChannelReader.get(context, "buildtime");


        Toast.makeText(this, WalleChannelReader.getChannel(getApplicationContext()), Toast.LENGTH_LONG).show();

    }
}
