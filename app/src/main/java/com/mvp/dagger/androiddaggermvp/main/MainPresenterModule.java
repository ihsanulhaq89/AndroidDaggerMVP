package com.mvp.dagger.androiddaggermvp.main;

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

    public MainPresenterModule(MainView mainView, Retrofit retrofit){
        this.mainView = mainView;
        this.retrofit = retrofit;
    }

    @Provides
    public MainPresenter providesPresenter() {
        return new MainPresenterImpl(mainView, retrofit);
    }


}