package com.srmstudios.bachatdotpk.ui.splash;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srmstudios.bachatdotpk.App;
import com.srmstudios.bachatdotpk.R;
import com.srmstudios.bachatdotpk.ui.home.HomeActivity;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class SplashFragment extends Fragment implements SplashMVP.View {
    @Inject
    SplashMVP.Presenter presenter;

    public SplashFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App)getActivity().getApplication()).getComponent().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_splash, container, false);

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                presenter.onSplashTimerEnd();
            }
        },2500);

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.setView(this);
    }

    @Override
    public void openHomeActivity() {
        SplashFragment.launch(getActivity());
    }

    public static void launch(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }
}


















