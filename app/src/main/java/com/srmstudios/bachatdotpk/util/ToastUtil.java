package com.srmstudios.bachatdotpk.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Admin on 10/31/2017.
 */

public class ToastUtil {
    private Context context;

    public ToastUtil(Context context) {
        this.context = context;
    }

    public void showToastShortTime(int messageResource) {
        if(context != null) {
            Toast.makeText(context,
                    context.getResources().getString(messageResource),
                    Toast.LENGTH_SHORT)
                    .show();
        }
    }

    public void showToastLongTime(int messageResource) {
        if(context != null) {
            Toast.makeText(context,
                    context.getResources().getString(messageResource),
                    Toast.LENGTH_LONG)
                    .show();
        }
    }

    public void showToastShortTime(String message) {
        if(context != null) {
            Toast.makeText(context,
                    message,
                    Toast.LENGTH_SHORT)
                    .show();
        }
    }

    public void showToastLongTime(String message) {
        if(context != null) {
            Toast.makeText(context,
                    message,
                    Toast.LENGTH_LONG)
                    .show();
        }
    }
}


















