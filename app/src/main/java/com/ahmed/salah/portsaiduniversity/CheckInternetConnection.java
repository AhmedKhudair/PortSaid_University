package com.ahmed.salah.portsaiduniversity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

/**
 * Created by Ahmed on 3/14/2018.
 */

public class CheckInternetConnection {

    Context context;

    public CheckInternetConnection(Context context) {
        this.context = context;
    }



    public boolean isConnect(){


        ConnectivityManager connectivityManager=(ConnectivityManager)context.getSystemService(context.CONNECTIVITY_SERVICE);
        if (connectivityManager !=null){
            NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
            if (networkInfo !=null && networkInfo.isConnected()){
                return true;
            }

        }
        return false;
    }





}
