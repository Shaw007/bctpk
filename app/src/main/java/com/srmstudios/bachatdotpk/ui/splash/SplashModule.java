package com.srmstudios.bachatdotpk.ui.splash;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 10/23/2017.
 */

@Module
public class SplashModule {

    @Provides
    public SplashMVP.Presenter provideSplashPresenter(){
        return new SplashPresenter();
    }

}
