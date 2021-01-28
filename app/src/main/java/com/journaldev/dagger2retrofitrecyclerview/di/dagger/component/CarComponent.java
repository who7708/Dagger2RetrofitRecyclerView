package com.journaldev.dagger2retrofitrecyclerview.di.dagger.component;

import com.journaldev.dagger2retrofitrecyclerview.di.dagger.module.CarModule;
import com.journaldev.dagger2retrofitrecyclerview.di.scopes.ActivityScope;
import com.journaldev.dagger2retrofitrecyclerview.ui.CarActivity;

import dagger.Component;

/**
 * @author Chris
 * @version 1.0.0
 * @date 1/28/21
 */
@ActivityScope
@Component(modules = CarModule.class)
public interface CarComponent {
    void injectCarActivity(CarActivity carActivity);
}
