package com.module.daggertrails.models;

import android.util.Log;

import javax.inject.Inject;

public class TwoWheeler {
    private static final String TAG = "CAR";
    @Inject
    Engine engine;
    @Inject
    Wheels wheels;

    @Inject
    TwoWheeler() {

    }

    public void runTwoWheeler(){
        engine.init();
        wheels.init();
        Log.d(TAG, "runTwoWheeler: Running...");
    }

    /*@Inject
    TwoWheeler(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }*/

}
