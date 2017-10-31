package com.srmstudios.bachatdotpk.ui.shopping_mall_detail;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.srmstudios.bachatdotpk.R;
import com.srmstudios.bachatdotpk.ui.BaseActivity;

public class ShoppingMallDetailActivity extends BaseActivity {
    @Override
    public int getLayout() {
        return R.layout.activity_base_without_drawer;
    }

    @Override
    public Fragment getFragment() {
        return new ShoppingMallDetailFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
