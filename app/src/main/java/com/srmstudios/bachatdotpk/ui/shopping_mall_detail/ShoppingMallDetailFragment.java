package com.srmstudios.bachatdotpk.ui.shopping_mall_detail;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srmstudios.bachatdotpk.R;

import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingMallDetailFragment extends Fragment {
    private int shoppingMallId;

    public static final String KEY_SHOPPING_MALL_ID = "com.srmstudios.bachatdotpk.ui.shopping_mall_detail.KEY_SHOPPING_MALL_ID";

    public ShoppingMallDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        shoppingMallId = getActivity().getIntent().getIntExtra(KEY_SHOPPING_MALL_ID,-1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_shopping_mall_detail, container, false);

        initializeViews(v);

        return v;
    }

    private void initializeViews(View v){
        ButterKnife.bind(this,v);
    }
}















