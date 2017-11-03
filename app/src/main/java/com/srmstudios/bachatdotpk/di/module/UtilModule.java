package com.srmstudios.bachatdotpk.di.module;

import android.content.Context;

import com.srmstudios.bachatdotpk.di.ApplicationContext;
import com.srmstudios.bachatdotpk.util.ImageLoadUtil;
import com.srmstudios.bachatdotpk.util.ToastUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 10/31/2017.
 */
@Module
public class UtilModule {

    @Provides
    @Singleton
    public ImageLoadUtil provideImageLoadUtil(@ApplicationContext Context context){
        return new ImageLoadUtil(context);
    }

    @Provides
    @Singleton
    public ToastUtil provideToastUtil(@ApplicationContext Context context){
        return new ToastUtil(context);
    }

}
