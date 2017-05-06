package com.mvp.dagger.androiddaggermvp.main;

import com.mvp.dagger.androiddaggermvp.api.ApiManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
class ApiModule {

    @Provides
    public ApiManager providesAPIManager(){
        return ApiManager.getInstance();
    }
}
