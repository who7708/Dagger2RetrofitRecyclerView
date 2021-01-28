package com.journaldev.dagger2retrofitrecyclerview.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.journaldev.dagger2retrofitrecyclerview.R;
import com.journaldev.dagger2retrofitrecyclerview.di.dagger.component.CarComponent;
import com.journaldev.dagger2retrofitrecyclerview.di.dagger.component.DaggerCarComponent;
import com.journaldev.dagger2retrofitrecyclerview.di.dagger.module.CarModule;
import com.journaldev.dagger2retrofitrecyclerview.di.dagger.pojo.Car;

import javax.inject.Inject;

/**
 * @author chmy
 */
public class CarActivity extends AppCompatActivity {

    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        CarComponent carComponent = DaggerCarComponent.builder()
                .carModule(new CarModule())
                .build();
        carComponent.injectCarActivity(this);
        Log.i(CarActivity.class.getName(), "onCreate: " + mCar.toString());
    }
}