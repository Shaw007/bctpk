package com.srmstudios.bachatdotpk.ui.home;

import com.srmstudios.bachatdotpk.data.network.model.response.ShoppingMallResponse;

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

    @Override
    public List<ShoppingMallResponse> getShoppingMalls() {
        List<ShoppingMallResponse> shoppingMalls = new ArrayList<>();
        ShoppingMallResponse s1 = new ShoppingMallResponse(1,"Dollmen - Tariq Road","http://www.dolmengroup.com/wp-content/themes/DolmenGroupNew/images/2001.jpg");
        ShoppingMallResponse s2 = new ShoppingMallResponse(2,"Dollmen - Clifton","https://media-cdn.tripadvisor.com/media/photo-s/08/5c/15/f7/dolmen-mall-clifton.jpg");
        ShoppingMallResponse s3 = new ShoppingMallResponse(3,"Atrium","http://nawabsteel.com/wp-content/uploads/2013/11/atrium-mall-karachi.jpg");
        ShoppingMallResponse s4 = new ShoppingMallResponse(4,"Neuplex","https://media-cdn.tripadvisor.com/media/photo-s/05/1a/b1/53/karachi.jpg");
        ShoppingMallResponse s5 = new ShoppingMallResponse(5,"Saima Mall","https://mw2.google.com/mw-panoramio/photos/small/23187525.jpg");
        ShoppingMallResponse s6 = new ShoppingMallResponse(6,"Millenium Mall","http://bolee.com/resources/items/img/2012/12/27/11965986791387732962.jpg");
        shoppingMalls.add(s1);
        shoppingMalls.add(s2);
        shoppingMalls.add(s3);
        shoppingMalls.add(s4);
        shoppingMalls.add(s5);
        shoppingMalls.add(s6);
        return shoppingMalls;
    }

}













