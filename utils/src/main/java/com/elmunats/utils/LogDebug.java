package com.elmunats.utils;

import android.util.Log;

/**
 * Created by Muhammad Natsir on 14,August,2019
 * Jakarta, Indonesia.
 */
public class LogDebug {
    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}