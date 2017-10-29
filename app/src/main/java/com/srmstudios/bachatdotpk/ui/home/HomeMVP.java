package com.srmstudios.bachatdotpk.ui.home;

/**
 * Created by Admin on 10/23/2017.
 */

public class HomeMVP {
    interface View{
        void openShoppingMallActivity();
    }

    interface Presenter{
        void setView(HomeMVP.View view);
        void onTxtShoppingMallsClick();
        void onTxtDiscountOnYourCardsClick();
    }

    interface Model{

    }
}
