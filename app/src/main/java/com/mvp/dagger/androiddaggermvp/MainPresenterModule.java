package com.mvp.dagger.androiddaggermvp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ihsanulhaq Pervez on 2/22/2017.
 */
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