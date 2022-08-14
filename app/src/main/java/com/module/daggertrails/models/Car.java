package com.module.daggertrails.models;

import android.util.Log;

import com.module.daggertrails.models.third_party.Brakes;
import com.module.daggertrails.models.third_party.CarSeats;
import com.module.daggertrails.models.third_party.Lights;
import com.module.daggertrails.models.third_party.Owner;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "CAR";
    String carName = "TATA";
    //@Inject
    Engine engine;
    // @Inject
    Wheels wheels;
    @Inject
    Lights lights;
    Remote remote;
    @Inject
    IFuel fuelType;
    @Inject
    CarSeats seats;
    @Inject
    Brakes brakes;
    @Inject
    Glasses glasses;
    @Inject
    Owner owner;


    public Owner getOwner() {
        return owner;
    }

    public Glasses getGlasses() {
        return glasses;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public CarSeats getSeats() {
        return seats;
    }

    public Lights getLights() {
        return lights;
    }

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

    /* @Inject
     Car() {

     }*/
    @Inject
    Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    /*@Inject
    Car(Engine engine, Wheels wheels, Lights lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.lights = lights;
    }*/

    @Inject
    public void connectToRemote(Remote remote) {
        Log.d(TAG, "CAR: Connect to remote Initiated...");
        remote.attachToCar(this);
        this.remote = remote;
    }

    public void drive() {
        engine.init();
        wheels.init();
        remote.init();
        Log.d(TAG, "drive: Vrooooh....");
    }
}
