package com.module.daggertrails;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.module.daggertrails.dagger.CarComponent;
import com.module.daggertrails.dagger.DaggerCarComponent;
import com.module.daggertrails.models.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CAR";
    @Inject
    Car car;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        //car = carComponent.getCarObj();
        carComponent.inject(this);
        car.drive();
        car.getRemote().testRemote();
        String fType = car.getFuel().getType();
        Log.d(TAG, "CAR: Fuel Type: " + fType);
    }
}
