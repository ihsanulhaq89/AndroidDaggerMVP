package com.mvp.dagger.androiddaggermvp.main;

import com.mvp.dagger.androiddaggermvp.api.ApiManager;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by Ihsanulhaq Pervez on 2/22/2017.
 */
public class MainPresenterImpl implements MainPresenter{
    private final Retrofit retrofit;
    private MainView mainView;
    ApiManager apiManager;

    public MainPresenterImpl(MainView mainView, Retrofit retrofit) {

        this.mainView = mainView;
        this.retrofit = retrofit;
    }

}
