package com.srmstudios.bachatdotpk.ui.home;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 10/23/2017.
 */
@Module
public class HomeModule {

    @Provides
    HomeMVP.Presenter provideHomePresenter(){
        return new HomePresenter();
    }
}
