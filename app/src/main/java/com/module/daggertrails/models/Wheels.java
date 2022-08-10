package com.module.daggertrails.models;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {
    private static final String TAG = "CAR";
    public String defaultWheels = "Alloy";


    @Inject
    public Wheels(Rims rims, Tires tires) {
    }

    void init() {
        Log.d(TAG, "Wheel: I'm Ready");
    }
}