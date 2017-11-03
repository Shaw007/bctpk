package com.srmstudios.bachatdotpk;

import android.app.Application;

import com.srmstudios.bachatdotpk.data.network.BachatRetrofitModule;
import com.srmstudios.bachatdotpk.di.component.ApplicationComponent;
import com.srmstudios.bachatdotpk.di.component.DaggerApplicationComponent;
import com.srmstudios.bachatdotpk.di.module.ApplicationModule;
import com.srmstudios.bachatdotpk.di.module.UtilModule;
import com.srmstudios.bachatdotpk.ui.home.HomeModule;
import com.srmstudios.bachatdotpk.ui.shopping_mall_detail.ShoppingMallDetailModule;
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
                .utilModule(new UtilModule())
                .bachatRetrofitModule(new BachatRetrofitModule())

                .splashModule(new SplashModule())
                .homeModule(new HomeModule())
                .shoppingMallDetailModule(new ShoppingMallDetailModule())
                .build();


    }

    public ApplicationComponent getComponent() {
        return component;
    }
}


























