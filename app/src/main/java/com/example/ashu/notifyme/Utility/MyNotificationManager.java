package com.example.ashu.notifyme.Utility;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.example.ashu.notifyme.Helper;
import com.example.ashu.notifyme.MainActivity;

public class MyNotificationManager {

    private Context mCtx;
    private static MyNotificationManager mInsatnce;

    private  MyNotificationManager(Context context){
        mCtx =context;

    }

    public static synchronized MyNotificationManager getMyInsatnce(Context context){

        if(mInsatnce==null){
            mInsatnce=new MyNotificationManager(context);
        }
        return mInsatnce;


    }


    public void displayNotification(String title,String body){

        NotificationCompat.Builder mBuilder=new NotificationCompat.Builder(mCtx, Helper.CHANNEL_ID)
                .setSmallIcon(android.support.compat.R.drawable.notification_icon_background)
                .setContentTitle(title)
                .setContentText(body);

        Intent intent=new Intent(mCtx, MainActivity.class);

        PendingIntent pendingIntent=PendingIntent.getActivity(mCtx,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(pendingIntent);

        NotificationManager mNotificationManager= (NotificationManager) mCtx.getSystemService(Context.NOTIFICATION_SERVICE);
        if (mNotificationManager!=null){

            mNotificationManager.notify(1,mBuilder.build());
        }


    }

}
