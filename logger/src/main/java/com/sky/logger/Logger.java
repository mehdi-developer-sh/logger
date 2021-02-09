package com.sky.logger;

import android.util.Log;

public class Logger {
    public static void i(String message) {
        Log.i(Logger.class.getSimpleName(), message);
    }

    public static void e(String message) {
        Log.e(Logger.class.getSimpleName(), message);
    }
    public static void w(String message) {
        Log.w(Logger.class.getSimpleName(), message);
    }
}
