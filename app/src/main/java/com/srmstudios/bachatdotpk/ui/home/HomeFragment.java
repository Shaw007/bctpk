package com.srmstudios.bachatdotpk.ui.home;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srmstudios.bachatdotpk.App;
import com.srmstudios.bachatdotpk.R;
import com.srmstudios.bachatdotpk.ui.shopping_mall_detail.ShoppingMallDetailActivity;
import com.srmstudios.bachatdotpk.ui.shopping_mall_detail.ShoppingMallDetailFragment;
import com.srmstudios.bachatdotpk.util.ImageLoadUtil;
import com.srmstudios.bachatdotpk.util.ToastUtil;
import com.synnapps.carouselview.CarouselView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements HomeMVP.View {
    @Inject
    HomeMVP.Presenter presenter;
    @Inject
    ToastUtil toastUtil;
    @Inject
    ImageLoadUtil imageLoadUtil; // for HomeAdapter class

    @BindView(R.id.carouselView)
    CarouselView carouselView;
    @BindView(R.id.recyclerViewShoppingMalls)
    RecyclerView recyclerViewShoppingMalls;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App)getActivity().getApplication()).getComponent().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        initializeViews(v);

        return v;
    }

    private void initializeViews(View v){
        ButterKnife.bind(this,v);

        recyclerViewShoppingMalls.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerViewShoppingMalls.setNestedScrollingEnabled(false);

        presenter.setupCarousalBanner(carouselView);
        presenter.setupShoppingMalls(recyclerViewShoppingMalls);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.setView(this);
    }

    public static void startShoppingMallDetailActivity(Context context, int shoppingMallId){
        Intent intent = new Intent(context, ShoppingMallDetailActivity.class);
        intent.putExtra(ShoppingMallDetailFragment.KEY_SHOPPING_MALL_ID,shoppingMallId);
        context.startActivity(intent);
    }

    @Override
    public void showExceptionError(String errorMessage) {
        toastUtil.showToastLongTime(errorMessage);
    }

    @Override
    public void openShoppingDetailActivity(int shoppingMallId) {
        startShoppingMallDetailActivity(getActivity(),shoppingMallId);
    }


}

























