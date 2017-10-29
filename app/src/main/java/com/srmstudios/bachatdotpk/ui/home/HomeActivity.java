package com.srmstudios.bachatdotpk.ui.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.srmstudios.bachatdotpk.R;
import com.srmstudios.bachatdotpk.ui.activity.BaseActivity;

public class HomeActivity extends BaseActivity {
    @Override
    public int getLayout() {
        return R.layout.activity_base_without_drawer;
    }

    @Override
    public Fragment getFragment() {
        return new HomeFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
