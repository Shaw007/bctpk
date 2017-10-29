package com.srmstudios.bachatdotpk;

import android.app.Application;

import com.srmstudios.bachatdotpk.di.ApplicationComponent;
import com.srmstudios.bachatdotpk.di.ApplicationModule;
import com.srmstudios.bachatdotpk.di.DaggerApplicationComponent;
import com.srmstudios.bachatdotpk.ui.home.HomeModule;
import com.srmstudios.bachatdotpk.ui.splash.SplashModule;

/**
 * Created by Admin on 10/23/2017.
 */

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .splashModule(new SplashModule())
                .homeModule(new HomeModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
