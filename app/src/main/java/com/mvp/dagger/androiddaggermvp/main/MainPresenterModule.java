package com.mvp.dagger.androiddaggermvp.main;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ihsanulhaq on 2/22/2017.
 */
@Singleton
@Module
public class MainPresenterModule {
    private final MainView mainView;

    public MainPresenterModule(MainView mainView){
        this.mainView = mainView;
    }

    @Provides
    public MainPresenter providesPresenter() {
        return new MainPresenterImpl(mainView);
    }


}