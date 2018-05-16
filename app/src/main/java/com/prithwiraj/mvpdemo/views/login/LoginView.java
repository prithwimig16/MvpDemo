package com.prithwiraj.mvpdemo.views.login;

import android.content.Context;

import com.prithwiraj.mvpdemo.base.Presenter;

public interface LoginView extends Presenter.View {

    void navigateHome();
    void showProgress();
    public  void hideProgress();
    void showError(String messgae);
    Context getContext();
}
