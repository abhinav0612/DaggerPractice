package com.example.daggerpractice;

import android.app.Application;

/**
 * Created by Abhinav Singh on 02,June,2020
 */
public class BaseApplication extends Application {

    ApplicationComponent getApplicationComponent = DaggerApplicationComponent.builder()
            .userName("Abhinav")
            .useId(6)
            .build();

}
