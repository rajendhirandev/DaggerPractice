package com.module.daggertrails.models;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    private static final String TAG = "CAR";
    public String defaultEngine = "Honda";

    @Inject
    public Engine() {
    }

    void init() {
        Log.d(TAG, "Engine: Started");
    }
}
