package com.example.pc.broadcast_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NetworkChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = intent;
        Toast.makeText(context,"Change status network",Toast.LENGTH_SHORT).show();
    }
}
