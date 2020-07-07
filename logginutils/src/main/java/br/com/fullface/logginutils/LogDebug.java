package br.com.fullface.logginutils;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "SUPER_AWSOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
        //test push
    }

}
