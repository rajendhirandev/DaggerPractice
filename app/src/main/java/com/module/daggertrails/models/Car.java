package com.module.daggertrails.models;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "CAR";
    String carName = "TATA";
    @Inject
    Engine engine;
    @Inject
    Wheels wheels;
    Remote remote;
    @Inject
    IFuel fuelType;

    public IFuel getFuel() {
        return fuelType;
    }

    public String getCarName() {
        return carName;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public Remote getRemote() {
        return remote;
    }

    @Inject
    Car() {

    }
   /* @Inject
    Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }*/

    @Inject
    public void connectToRemote(Remote remote) {
        this.remote = remote;
        Log.d(TAG, "CAR: Connect to remote Initiated...");
        remote.attachToCar(this);
    }

    public void drive() {
        engine.init();
        wheels.init();
        remote.init();
        Log.d(TAG, "drive: Vrooooh....");
    }
}
