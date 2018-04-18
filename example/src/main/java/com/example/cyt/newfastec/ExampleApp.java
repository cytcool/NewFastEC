package com.example.cyt.newfastec;

import android.app.Application;

import com.example.latte.app.Latte;
import com.example.latte.ec.icon.FontEcModel;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by CYT on 2018/4/18.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModel())
                .configure();
    }
}
