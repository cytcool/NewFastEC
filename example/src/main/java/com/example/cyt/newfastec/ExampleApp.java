package com.example.cyt.newfastec;

import android.app.Application;

import com.example.latte.app.Latte;

/**
 * Created by CYT on 2018/4/18.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .configure();
    }
}
