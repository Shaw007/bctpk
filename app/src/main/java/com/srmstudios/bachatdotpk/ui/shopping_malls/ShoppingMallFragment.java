package com.srmstudios.bachatdotpk.ui.shopping_malls;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srmstudios.bachatdotpk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingMallFragment extends Fragment {


    public ShoppingMallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_shopping_mall, container, false);

        

        return v;
    }

}
