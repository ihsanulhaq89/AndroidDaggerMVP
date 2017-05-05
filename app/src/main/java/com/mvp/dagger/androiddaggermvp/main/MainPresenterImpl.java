package com.mvp.dagger.androiddaggermvp.main;

import com.mvp.dagger.androiddaggermvp.api.ApiManager;

import javax.inject.Inject;

/**
 * Created by Ihsanulhaq Pervez on 2/22/2017.
 */
public class MainPresenterImpl implements MainPresenter{
    private MainView mainView;

    @Inject
    ApiManager apiManager;

    public MainPresenterImpl(MainView mainView) {

        this.mainView = mainView;
    }

}
