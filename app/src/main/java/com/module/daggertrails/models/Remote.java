package com.module.daggertrails.models;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "CAR";
    Car car;

    @Inject
    public Remote() {

    }

    void attachToCar(Car car) {
        Log.d(TAG, "Car: Remote connected to the car");
        this.car = car;
    }

    public void testRemote() {
        Log.d(TAG, "Test Remote on the " + car.carName + " car");
    }

    void init() {
        Log.d(TAG, "Remote: Setup is done");
    }
}