package com.srmstudios.bachatdotpk.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.srmstudios.bachatdotpk.R;

import javax.inject.Inject;

/**
 * Created by Admin on 10/31/2017.
 */

public class ImageLoadUtil {
    private Context context;

    @Inject
    public ImageLoadUtil(Context context) {
        this.context = context;
    }

    public void loadBannerImage(ImageView imageView, String url) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions
                .placeholder(R.mipmap.ic_launcher);
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .into(imageView);
    }
}
