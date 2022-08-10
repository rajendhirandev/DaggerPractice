package com.module.daggertrails.dagger;

import com.module.daggertrails.MainActivity;
import com.module.daggertrails.models.Car;
import com.module.daggertrails.models.GasTypeModule;
import com.module.daggertrails.models.LightsModule;

import dagger.Component;

@Component(modules = {GasTypeModule.class, LightsModule.class})
public interface CarComponent {
    Car getCarObj();

    void inject(MainActivity mainActivity);
}
