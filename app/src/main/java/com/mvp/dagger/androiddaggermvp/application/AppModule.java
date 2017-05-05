package com.mvp.dagger.androiddaggermvp.application;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Singleton
@Module
public class AppModule {

    private final String serverUrl = "<Add url here>";

    @Provides
    public Retrofit getRetrofitObject(){
        return new Retrofit.Builder().
                baseUrl(serverUrl).
                addConverterFactory(GsonConverterFactory.create()).
                build();
    }
}
