package com.mvp.dagger.androiddaggermvp;

/**
 * Created by Ihsanulhaq Pervez on 2/22/2017.
 */
public interface MainView {

    void showProgress();

    void onHideProgress();

    void onError(String error);

    void onSuccess(String data);
}
