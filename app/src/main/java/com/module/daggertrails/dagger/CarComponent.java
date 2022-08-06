package com.module.daggertrails.dagger;

import com.module.daggertrails.MainActivity;
import com.module.daggertrails.models.Car;
import com.module.daggertrails.models.DieselTypeModule;
import com.module.daggertrails.models.PetrolTypeModule;

import dagger.Component;

@Component(modules = {PetrolTypeModule.class})
public interface CarComponent {
    Car getCarObj();
    void inject(MainActivity mainActivity);
}
