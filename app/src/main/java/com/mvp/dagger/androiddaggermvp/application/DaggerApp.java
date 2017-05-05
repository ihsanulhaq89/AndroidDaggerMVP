package com.mvp.dagger.androiddaggermvp.application;

import android.app.Application;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class DaggerApp extends Application {
    @Inject
    Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.create().inject(this);
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

}
