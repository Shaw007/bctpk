package com.srmstudios.bachatdotpk.util;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 10/31/2017.
 */
@Module
public class UtilModule {
    private Context context;

    public UtilModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public ImageLoadUtil provideImageLoadUtil(){
        return new ImageLoadUtil(context);
    }

    @Provides
    @Singleton
    public ToastUtil provideToastUtil(){
        return new ToastUtil(context);
    }

}
