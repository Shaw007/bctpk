package com.srmstudios.bachatdotpk.ui.splash;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.srmstudios.bachatdotpk.R;
import com.srmstudios.bachatdotpk.ui.activity.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    public int getLayout() {
        return R.layout.activity_base_without_drawer;
    }

    @Override
    public Fragment getFragment() {
        return new SplashFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getToolbar().setVisibility(View.GONE);
    }
}






















