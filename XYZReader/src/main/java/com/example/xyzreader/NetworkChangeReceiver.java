package com.example.xyzreader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

public class NetworkChangeReceiver extends BroadcastReceiver {

    private NetworkStateListener listener;

    public void setNetworkStateListener(NetworkStateListener networkStateListener){
        listener = networkStateListener;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        if (action != null && action.equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
            listener.networkStateConnected(Utility.checkInternetConnection(context));
        }
    }

    public interface NetworkStateListener{
        void networkStateConnected(boolean status);
    }
}
