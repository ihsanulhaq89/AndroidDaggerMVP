package com.mvp.dagger.androiddaggermvp.application;


import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(DaggerApp app);
}
