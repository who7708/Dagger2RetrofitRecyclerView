package com.journaldev.dagger2retrofitrecyclerview.di.dagger.pojo;

import androidx.annotation.NonNull;

import javax.inject.Inject;

/**
 * @author Chris
 * @version 1.0.0
 * @date 1/28/21
 */
public class Car {
    @Inject
    public Car() {
    }

    @NonNull
    @Override
    public String toString() {
        return "汽车";
    }
}
