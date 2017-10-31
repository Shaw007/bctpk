package com.srmstudios.bachatdotpk.ui.home;

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
    }

    interface Model{
        List<String> getPromotionBannerImages();
    }
}
