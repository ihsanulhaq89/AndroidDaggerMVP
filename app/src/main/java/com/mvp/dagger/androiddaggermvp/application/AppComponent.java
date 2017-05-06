package com.mvp.dagger.androiddaggermvp.application;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(DaggerApp app);
}
