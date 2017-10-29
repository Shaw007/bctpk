package com.srmstudios.bachatdotpk.ui.shopping_malls;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.srmstudios.bachatdotpk.R;
import com.srmstudios.bachatdotpk.ui.activity.BaseActivity;
import com.srmstudios.bachatdotpk.ui.home.HomeFragment;

public class ShoppingMallActivity extends BaseActivity {
    @Override
    public int getLayout() {
        return R.layout.activity_base_without_drawer;
    }

    @Override
    public Fragment getFragment() {
        return new ShoppingMallFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
