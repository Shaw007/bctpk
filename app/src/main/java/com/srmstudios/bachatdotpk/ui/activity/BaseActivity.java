package com.srmstudios.bachatdotpk.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.srmstudios.bachatdotpk.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Admin on 10/23/2017.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    public abstract int getLayout();
    public abstract Fragment getFragment();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        setSupportActionBar(getToolbar());
        initialize();
    }

    private void initialize(){
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragmentContainer);
        if(fragment == null){
            fragment = getFragment();
            manager.beginTransaction()
                    .add(R.id.fragmentContainer,fragment)
                    .commit();
        }
    }







    public Toolbar getToolbar() {
        return toolbar;
    }
}





















