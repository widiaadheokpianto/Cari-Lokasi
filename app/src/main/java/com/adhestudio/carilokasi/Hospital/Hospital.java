package com.adhestudio.carilokasi.Hospital;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by SURATENG on 03/05/2018.
 */

public class Hospital extends Application
{
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
