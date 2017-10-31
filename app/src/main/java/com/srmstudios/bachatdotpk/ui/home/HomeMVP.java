package com.srmstudios.bachatdotpk.ui.home;

import android.support.v7.widget.RecyclerView;

import com.srmstudios.bachatdotpk.data.network.model.response.ShoppingMallResponse;
import com.synnapps.carouselview.CarouselView;

import java.util.List;

/**
 * Created by Admin on 10/23/2017.
 */

public class HomeMVP {
    interface View{
        void showExceptionError(String errorMessage);
    }

    interface Presenter{
        void setView(HomeMVP.View view);
        void setupCarousalBanner(CarouselView carouselView);
        void setupShoppingMalls(RecyclerView recyclerView);
    }

    interface Model{
        List<String> getPromotionBannerImages();
        List<ShoppingMallResponse> getShoppingMalls();
    }
}
