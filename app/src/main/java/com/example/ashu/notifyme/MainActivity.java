package com.example.ashu.notifyme;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {

            NotificationManager mNotificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
            NotificationChannel mChannel=new NotificationChannel(Helper.CHANNEL_ID,Helper.CHANNEL_NAME,NotificationManager.IMPORTANCE_HIGH);

            mChannel.setDescription(Helper.CHANNEL_DESCRPTION);
            mChannel.enableLights(true);
            mChannel.setLightColor(Color.RED);
            mChannel.shouldVibrate();
            mChannel.setVibrationPattern(new long[]{100,200,300,400});

            mNotificationManager.createNotificationChannel(mChannel);
        }*/
    }
}
