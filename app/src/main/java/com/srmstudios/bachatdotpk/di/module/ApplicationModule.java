package com.srmstudios.bachatdotpk.di.module;

import android.app.Application;
import android.content.Context;

import com.srmstudios.bachatdotpk.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 10/23/2017.
 */

@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    @ApplicationContext
    public Context getContext(){
        return application;
    }
}
