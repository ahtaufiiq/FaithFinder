package com.geekies.sisfo.masjid;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class MasjidDetectorApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    //for multidex
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        MultiDex.install(this);
    }
}

