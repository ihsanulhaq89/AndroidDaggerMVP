package com.mvp.dagger.androiddaggermvp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mvp.dagger.androiddaggermvp.R;
import com.mvp.dagger.androiddaggermvp.api.ApiManager;
import com.mvp.dagger.androiddaggermvp.application.DaggerApp;

import javax.inject.Inject;


/**
 * Created by Ihsanulhaq on 2/22/2017.
 */
public class MainActivity extends AppCompatActivity implements MainView{

    @Inject
    MainPresenter mainPresenter;

    @Inject
    ApiManager manager;

    // Todo: Create a MainActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DaggerApp app = (DaggerApp) getApplicationContext();
        DaggerMainComponent.builder()
                //.apiModule(new ApiModule())
                .mainPresenterModule(new MainPresenterModule(this, app.getRetrofit()))
                .build()
                .inject(this);

        mainPresenter.toString();
    }


}
