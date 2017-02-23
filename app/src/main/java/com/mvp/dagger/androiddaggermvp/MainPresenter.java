package com.mvp.dagger.androiddaggermvp;

/**
 * Created by Ihsanulhaq Pervez on 2/22/2017.
 */
public interface MainPresenter {
    void onButtonClick(String email, String password);

    void onProcessStart();

    void onSuccess(String email);

    void onError(String error);
}
