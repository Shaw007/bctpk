package com.srmstudios.bachatdotpk.ui.splash;

/**
 * Created by Admin on 10/23/2017.
 */

public class SplashPresenter implements SplashMVP.Presenter {
    private SplashMVP.View view;

    @Override
    public void setView(final SplashMVP.View view) {
        this.view = view;
    }

    @Override
    public void onSplashTimerEnd() {
        view.openHomeActivity();
    }


}























