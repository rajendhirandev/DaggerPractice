package com.module.daggertrails.models;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "CAR";
    @Inject Engine engine;
    @Inject Wheels wheels;

    @Inject
    Car(){

    }
   /* @Inject
    Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }*/

    public void drive() {
        engine.init();
        wheels.init();
        Log.d(TAG, "drive: Vrooooh....");
    }
}

class Engine {
    private static final String TAG = "CAR";
    @Inject
    public Engine() {
    }

    void init(){
        Log.d(TAG,"Engine: Started");
    }
}

class Wheels {
    private static final String TAG = "CAR";
    @Inject
    public Wheels(Rims rims, Tires tires) {
    }

    void init(){
        Log.d(TAG,"Wheel: I'm Ready");
    }
}

class Tires {
    String tireType;

    @Inject
    Tires() {
    }

}

class Rims {

    @Inject
    public Rims() {
    }

    String rimType;

    public String getRimType() {
        return rimType;
    }

    public void setRimType(String rimType) {
        this.rimType = rimType;
    }
}
