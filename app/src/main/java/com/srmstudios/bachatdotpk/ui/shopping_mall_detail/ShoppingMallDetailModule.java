package com.srmstudios.bachatdotpk.ui.shopping_mall_detail;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 10/31/2017.
 */

@Module
public class ShoppingMallDetailModule {

    @Provides
    public ShoppingMallDetailMVP.Presenter provideShoppingMallDetailPresenter(ShoppingMallDetailMVP.Model model){
        return new ShoppingMallDetailPresenter(model);
    }

    @Provides
    public ShoppingMallDetailMVP.Model provideShoppingMallDetailModel(){
        return new ShoppingMallDetailModel();
    }
}












