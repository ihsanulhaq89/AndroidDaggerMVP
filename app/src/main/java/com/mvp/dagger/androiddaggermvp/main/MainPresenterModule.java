package com.mvp.dagger.androiddaggermvp.main;

import com.mvp.dagger.androiddaggermvp.api.ApiManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Ihsanulhaq on 2/22/2017.
 */
@Singleton
@Module
public class MainPresenterModule {
    private final MainView mainView;
    private final Retrofit retrofit;

    public MainPresenterModule(MainView mainView, Retrofit retrofit) {
        this.mainView = mainView;
        this.retrofit = retrofit;
    }


    @Singleton
    @Provides
    public ApiManager providesAPIManager(){
        return ApiManager.getInstance();
    }


    @Singleton
    @Provides
    public MainPresenter providesPresenter(ApiManager apiManager) {
        return new MainPresenterImpl(mainView, retrofit, apiManager);
    }


}