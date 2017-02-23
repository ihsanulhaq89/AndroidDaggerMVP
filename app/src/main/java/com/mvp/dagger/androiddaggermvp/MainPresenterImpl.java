package com.mvp.dagger.androiddaggermvp;

import android.os.CountDownTimer;

/**
 * Created by Ihsanulhaq Pervez on 2/22/2017.
 */
public class MainPresenterImpl implements MainPresenter{
    private MainView mainView;

    public MainPresenterImpl(MainView mainView) {this.mainView = mainView;}
    @Override
    public void onButtonClick(String email, String password) {
        onProcessStart();
        new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                onSuccess("abc");
            }
        }.start();
    }

    @Override
    public void onProcessStart() {
        mainView.showProgress();
    }

    @Override
    public void onSuccess(String email) {
        mainView.onHideProgress();
        mainView.onSuccess(email);

    }

    @Override
    public void onError(String error) {
        mainView.onHideProgress();
        mainView.onError(error);

    }
}
