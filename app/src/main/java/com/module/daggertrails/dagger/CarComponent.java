package com.module.daggertrails.dagger;

import com.module.daggertrails.MainActivity;
import com.module.daggertrails.models.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {GasTypeModule.class, LightsModule.class, SeatModule.class, BrakeModule.class})
public interface CarComponent {
    Car getCarObj();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder glassType(@Named("glassType") String gType);

        @BindsInstance
        Builder glassThickness(@Named("glassThick") Double gThick);

        @BindsInstance
        Builder engineName(String eName);

        @BindsInstance
        Builder engineCapacity(Double eCap);

        Builder seatModule(SeatModule seatModule);

        Builder lightsModule(LightsModule lightsModule);

        CarComponent build();
    }
}
