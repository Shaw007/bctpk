package com.srmstudios.bachatdotpk.data.network.model.response;

/**
 * Created by Admin on 10/31/2017.
 */

public class ShoppingMallResponse {
    private int id;
    private String name;
    private String avatar;

    public ShoppingMallResponse(int id, String name, String avatar) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
