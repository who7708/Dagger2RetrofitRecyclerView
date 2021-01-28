package com.journaldev.dagger2retrofitrecyclerview.di.dagger.module;

import com.journaldev.dagger2retrofitrecyclerview.di.dagger.pojo.Car;

import dagger.Module;
import dagger.Provides;

/**
 * @author Chris
 * @version 1.0.0
 * @date 1/28/21
 */
@Module
public class CarModule {

    @Provides
    public Car provideCar() {
        return new Car();
    }
}
