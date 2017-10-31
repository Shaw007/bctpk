package com.srmstudios.bachatdotpk.ui.home;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 10/31/2017.
 */

public class HomeModel implements HomeMVP.Model {

    @Override
    public List<String> getPromotionBannerImages() {
        List<String> bannerImages = new ArrayList<>();
        bannerImages.add("https://uidesign.gamcdn.com/gamiss/images/pageimg/promotion/valentine/banner.jpg");
        bannerImages.add("http://www.shopickr.com/wp-content/uploads/2015/12/amazon-india-fashion-sale-2015-banner-winter.jpg");
        bannerImages.add("https://en.lynka.eu/Data/Thumbs/adrobna@lynka.eu/Nzc5eDMwMA,bc_banner-promosafran_export.jpg");
        return bannerImages;
    }

}













