package com.module.daggertrails.dagger;


import com.module.daggertrails.MainActivity;
import com.module.daggertrails.models.Car;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCarObj();
    void inject(MainActivity mainActivity);
}
