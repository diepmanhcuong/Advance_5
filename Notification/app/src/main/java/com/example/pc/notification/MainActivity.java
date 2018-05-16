    package com.example.pc.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void clickMe(View view) {
            final NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

            Intent intent = new Intent(MainActivity.this,ShowNotification.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(this,1 ,intent,0);

            final Notification.Builder notification = new Notification.Builder(this);
            notification.setContentTitle("Notification");
            notification.setContentText("learning Notìiification");
            notification.setSmallIcon(R.drawable.ic_launcher_background);
            notification.setContentIntent(pendingIntent);
            notification.addAction(R.drawable.ic_launcher_background,"gọi đt",pendingIntent);
            notification.addAction(R.drawable.ic_launcher_background,"nhắn tin",pendingIntent);
            //notification.setStyle(new Notification.BigTextStyle().bigText("Learning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning NotificationLearning Notificationv"));
            notification.setAutoCancel(true);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i =0;i<=100;i+=10){
                        notification.setProgress(100,i,false);
                        notificationManager.notify(1,notification.build());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    notification.setContentText("Complete");
                    notification.setProgress(0,0,false);
                    notificationManager.notify(1,notification.build());

                }
            }).start();

            notificationManager.notify(1,notification.build());
        }
    }