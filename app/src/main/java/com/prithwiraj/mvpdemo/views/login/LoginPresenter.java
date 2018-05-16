package com.prithwiraj.mvpdemo.views.login;

import android.app.AlertDialog;
import android.widget.Toast;

import com.prithwiraj.mvpdemo.base.Presenter;
import com.prithwiraj.mvpdemo.model.Credential;

import javax.inject.Inject;

public class LoginPresenter implements Presenter<LoginView> {

    private LoginView loginView;
    private final Credential credential;


    @Inject
    LoginPresenter(Credential credential){
        this.credential=credential;

    }
    @Override
    public void OnCreate() {

    }

    @Override
    public void Onstart() {

    }

    @Override
    public void OnStop() {

    }

    @Override
    public void OnResume() {

    }

    @Override
    public void OnPause() {

    }

    @Override
    public void attachView(LoginView view) {
        this.loginView = view;


    }

    public void doLogin(String userName,String password){
        if(userName.matches("p")&&password.matches("1")){
            loginView.navigateHome();
        }
        else{
            Toast.makeText(loginView.getContext(), "Enter password!", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void oncreate() {




    }
}
