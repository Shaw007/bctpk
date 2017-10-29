package com.srmstudios.bachatdotpk.ui.splash;

/**
 * Created by Admin on 10/23/2017.
 */

public interface SplashMVP {
    interface View{
        void openHomeActivity();
    }

    interface Presenter{
        void setView(SplashMVP.View view);
        void onSplashTimerEnd();
    }
}
