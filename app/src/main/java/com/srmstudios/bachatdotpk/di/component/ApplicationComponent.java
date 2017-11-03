package com.srmstudios.bachatdotpk.di.component;

import com.srmstudios.bachatdotpk.data.network.BachatRetrofitModule;
import com.srmstudios.bachatdotpk.di.module.ApplicationModule;
import com.srmstudios.bachatdotpk.di.module.UtilModule;
import com.srmstudios.bachatdotpk.ui.home.HomeFragment;
import com.srmstudios.bachatdotpk.ui.home.HomeModule;
import com.srmstudios.bachatdotpk.ui.shopping_mall_detail.ShoppingMallDetailFragment;
import com.srmstudios.bachatdotpk.ui.shopping_mall_detail.ShoppingMallDetailModule;
import com.srmstudios.bachatdotpk.ui.splash.SplashFragment;
import com.srmstudios.bachatdotpk.ui.splash.SplashModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Admin on 10/23/2017.
 */
@Singleton
@Component(modules = {ApplicationModule.class,UtilModule.class,BachatRetrofitModule.class,SplashModule.class, HomeModule.class, ShoppingMallDetailModule.class})
public interface ApplicationComponent {

    void inject(SplashFragment splashFragment);
    void inject(HomeFragment homeFragment);
    void inject(ShoppingMallDetailFragment shoppingMallDetailFragment);


}
