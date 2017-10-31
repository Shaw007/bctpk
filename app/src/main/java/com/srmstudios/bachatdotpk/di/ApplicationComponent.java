package com.srmstudios.bachatdotpk.di;

import com.srmstudios.bachatdotpk.data.network.BachatRetrofitModule;
import com.srmstudios.bachatdotpk.ui.home.HomeFragment;
import com.srmstudios.bachatdotpk.ui.home.HomeModule;
import com.srmstudios.bachatdotpk.ui.shopping_mall_detail.ShoppingMallDetailFragment;
import com.srmstudios.bachatdotpk.ui.shopping_mall_detail.ShoppingMallDetailModule;
import com.srmstudios.bachatdotpk.ui.splash.SplashFragment;
import com.srmstudios.bachatdotpk.ui.splash.SplashModule;
import com.srmstudios.bachatdotpk.util.UtilModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Admin on 10/23/2017.
 */
@Singleton
@Component(modules = {ApplicationModule.class, SplashModule.class, HomeModule.class, ShoppingMallDetailModule.class,UtilModule.class, BachatRetrofitModule.class})
public interface ApplicationComponent {

    void inject(SplashFragment splashFragment);
    void inject(HomeFragment homeFragment);
    void inject(ShoppingMallDetailFragment shoppingMallDetailFragment);

}
