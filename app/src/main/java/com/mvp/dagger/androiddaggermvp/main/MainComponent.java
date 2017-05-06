package com.mvp.dagger.androiddaggermvp.main;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ihsanulhaq on 2/22/2017.
 */
@Singleton
@Component(modules = {MainPresenterModule.class})
public interface MainComponent {
    void inject(MainActivity obj);
}
