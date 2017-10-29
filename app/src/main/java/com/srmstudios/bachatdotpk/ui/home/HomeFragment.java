package com.srmstudios.bachatdotpk.ui.home;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.srmstudios.bachatdotpk.App;
import com.srmstudios.bachatdotpk.R;
import com.srmstudios.bachatdotpk.ui.shopping_malls.ShoppingMallActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements HomeMVP.View {
    @Inject
    HomeMVP.Presenter presenter;

    @BindView(R.id.txtShoppingMalls)
    TextView txtShoppingMalls;
    @OnClick(R.id.txtShoppingMalls)
    public void onTxtShoppingMalls(View view) {
        presenter.onTxtShoppingMallsClick();
    }

    @BindView(R.id.txtDiscountOnYourCards)
    TextView txtDiscountOnYourCards;
    @OnClick(R.id.txtDiscountOnYourCards)
    public void onTxtDiscountOnYourCards(View view) {
        presenter.onTxtDiscountOnYourCardsClick();
    }

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
        View v =inflater.inflate(R.layout.fragment_home, container, false);

        initializeViews(v);

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.setView(this);
    }

    private void initializeViews(View v){
        ButterKnife.bind(this,v);
    }



    public static void openShoppingMallActivity(Context context){
        Intent intent = new Intent(context, ShoppingMallActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void openShoppingMallActivity() {
        HomeFragment.openShoppingMallActivity(getActivity());
    }
}

























