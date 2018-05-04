package com.lin.walle;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.meituan.android.walle.ChannelInfo;
import com.meituan.android.walle.WalleChannelReader;

import java.util.Map;

public class APP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        /**
         * 使用channelFile --channel配置
         */
        Log.e(getClass().getSimpleName(), WalleChannelReader.getChannel(this));

        /**
         * 使用configFile --config.json配置
         */
        ChannelInfo channelInfo= WalleChannelReader.getChannelInfo(this);
        if (channelInfo != null) {
            String channel = channelInfo.getChannel();
            Map<String, String> extraInfo = channelInfo.getExtraInfo();
        }
        // 或者也可以直接根据key获取
//        String value = WalleChannelReader.get(context, "buildtime");

        Toast.makeText(this, WalleChannelReader.getChannel(this), Toast.LENGTH_LONG).show();
    }
}
