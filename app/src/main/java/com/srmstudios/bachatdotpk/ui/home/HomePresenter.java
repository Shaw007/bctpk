package com.srmstudios.bachatdotpk.ui.home;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.srmstudios.bachatdotpk.util.ImageLoadUtil;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.List;

/**
 * Created by Admin on 10/23/2017.
 */

public class HomePresenter implements HomeMVP.Presenter {
    private HomeMVP.View view;
    private HomeMVP.Model model;
    private ImageLoadUtil imageLoadUtil;
    private List<String> bannerImages;
    private HomeAdapter homeAdapter;


    public HomePresenter(HomeMVP.Model model,ImageLoadUtil imageLoadUtil){
        this.model = model;
        this.imageLoadUtil = imageLoadUtil;
    }

    @Override
    public void setView(HomeMVP.View view) {
        this.view = view;
    }

    @Override
    public void setupCarousalBanner(CarouselView carouselView) {
        try {
            // THIS WILL BE CALLED THROUGH API
            bannerImages = model.getPromotionBannerImages();

            carouselView.setImageListener(imageListener);
            carouselView.setPageCount(bannerImages.size());
            carouselView.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    //txtBanner.setText(promotionTextList.get(position));
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }catch (Exception ex){
            ex.printStackTrace();
            view.showExceptionError(ex.getMessage());
        }
    }

    @Override
    public void setupShoppingMalls(RecyclerView recyclerView) {
        homeAdapter = new HomeAdapter(imageLoadUtil,model.getShoppingMalls());
        recyclerView.setAdapter(homeAdapter);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageLoadUtil.loadBannerImage(imageView,bannerImages.get(position));
        }
    };
}















