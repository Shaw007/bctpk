package com.srmstudios.bachatdotpk.ui.home;

/**
 * Created by Admin on 10/23/2017.
 */

public class HomePresenter implements HomeMVP.Presenter {
    private HomeMVP.View view;

    @Override
    public void setView(HomeMVP.View view) {
        this.view = view;
    }

    @Override
    public void onTxtShoppingMallsClick() {
        view.openShoppingMallActivity();
    }

    @Override
    public void onTxtDiscountOnYourCardsClick() {

    }
}
