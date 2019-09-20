package com.tregz.mvc;

import android.app.Application;

import androidx.appcompat.app.AppCompatDelegate;

public class MvcApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // vector drawables on older platforms (< API 21)
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
