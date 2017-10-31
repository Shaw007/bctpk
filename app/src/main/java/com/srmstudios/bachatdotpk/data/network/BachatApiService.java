package com.srmstudios.bachatdotpk.data.network;

import com.srmstudios.bachatdotpk.data.network.model.response.ShoppingMallResponse;

import java.util.List;

import retrofit2.http.GET;

/**
 * Created by Admin on 10/31/2017.
 */

public interface BachatApiService {

    @GET("/")
    List<ShoppingMallResponse> getShoppingMalls();

}
