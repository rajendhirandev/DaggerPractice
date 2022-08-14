package com.module.daggertrails;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.module.daggertrails.dagger.CarComponent;
import com.module.daggertrails.dagger.DaggerCarComponent;
import com.module.daggertrails.dagger.LightsModule;
import com.module.daggertrails.dagger.SeatModule;
import com.module.daggertrails.models.Car;
import com.module.daggertrails.models.third_party.BackSeats;
import com.module.daggertrails.models.third_party.FrontSeats;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CAR";
    @Inject
    Car car;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder()
                .glassType("Saint-Gobain")
                .glassThickness(12.59)
                .engineCapacity(19.2)
                .engineName("Toyota")
                .seatModule(new SeatModule(new FrontSeats("Hard"),new BackSeats("Wire")))
                .lightsModule(new LightsModule("Sky Blue"))
                .build();
        //car = carComponent.getCarObj();
        carComponent.inject(this);
        System.out.println("__________________________");
        printDetails(car);
    }

    public void printDetails(Car car){
        car.drive();
        car.getRemote().testRemote();
        String fType = car.getFuel().getType();
        Log.d(TAG, "CAR: Fuel Type: " + fType);
        Log.d(TAG, "CAR: Engine: " + car.getEngine().defaultEngine);
        Log.d(TAG, "CAR: Wheel Material: " + car.getWheels().defaultWheels);
        car.getLights().display();
        car.getSeats().seatQuality();
        car.getBrakes().brakeDetails();
        car.getGlasses().glassDetails();
    }
}
