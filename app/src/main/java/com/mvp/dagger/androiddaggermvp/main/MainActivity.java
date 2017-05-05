package com.mvp.dagger.androiddaggermvp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mvp.dagger.androiddaggermvp.R;

import javax.inject.Inject;


/**
 * Created by Ihsanulhaq on 2/22/2017.
 */
public class MainActivity extends AppCompatActivity implements MainView{

    @Inject
    MainPresenter mainPresenter;

    // Todo: Create a MainActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
