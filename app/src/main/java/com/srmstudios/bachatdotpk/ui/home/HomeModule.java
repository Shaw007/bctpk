package com.srmstudios.bachatdotpk.ui.home;

import com.srmstudios.bachatdotpk.util.ImageLoadUtil;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 10/23/2017.
 */
@Module
public class HomeModule {

    @Provides
    HomeMVP.Presenter provideHomePresenter(HomeMVP.Model model, ImageLoadUtil imageLoadUtil){
        return new HomePresenter(model,imageLoadUtil);
    }

    @Provides
    HomeMVP.Model provideHomeModel(){
        return new HomeModel();
    }
}
