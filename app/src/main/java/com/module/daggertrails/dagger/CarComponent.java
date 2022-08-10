package com.module.daggertrails.dagger;

import com.module.daggertrails.MainActivity;
import com.module.daggertrails.models.Car;
import com.module.daggertrails.models.GasTypeModule;

import dagger.Component;

@Component(modules = {GasTypeModule.class})
public interface CarComponent {
    Car getCarObj();

    void inject(MainActivity mainActivity);
}
