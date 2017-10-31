package com.srmstudios.bachatdotpk.ui.shopping_mall_detail;

import android.graphics.drawable.GradientDrawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;

import com.srmstudios.bachatdotpk.R;
import com.srmstudios.bachatdotpk.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 10/31/2017.
 */

public class ShoppingMallDetailPresenter implements ShoppingMallDetailMVP.Presenter {
    private ShoppingMallDetailMVP.View view;
    private ShoppingMallDetailMVP.Model model;

    public ShoppingMallDetailPresenter(ShoppingMallDetailMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(ShoppingMallDetailMVP.View view) {
        this.view = view;
    }

}




















