package com.mvp.dagger.androiddaggermvp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ihsanulhaq Pervez on 2/22/2017.
 */
@Singleton
@Component(modules = MainPresenterModule.class)
public interface MainComponent {
    void inject(MainActivity obj);
}
