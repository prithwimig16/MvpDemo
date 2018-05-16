package com.prithwiraj.mvpdemo.views.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.prithwiraj.mvpdemo.R;
import com.prithwiraj.mvpdemo.base.BaseActivity;
import com.prithwiraj.mvpdemo.views.dashBoard.DashBoardActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginView {

    @BindView(R.id.bt_signin)
    TextView btSignIn;

    @BindView(R.id.editTextLoginUSerName)
    EditText etUserName;

    @BindView(R.id.editTextLoginPassword)
    EditText etPassword;

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected boolean canDisplayBackButton() {
        return false;
    }

    @Override
    protected void initPresenter() {
        loginPresenter.oncreate();
        loginPresenter.attachView(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void intDagger() {
       applicationComponent.inject(this);
    }

    @Override
    protected int initialize(Bundle bundle) {
        return 0;
    }

    @Override
    public void navigateHome() {

        Intent i=new Intent(LoginActivity.this,DashBoardActivity.class);
        startActivity(i);
        finish();

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String messgae) {

    }

    @Override
    public Context getContext() {
        return this;
    }

    @OnClick(R.id.bt_signin)
    void onLogin(){
        String userName=etUserName.getText().toString().trim();
        String password=etPassword.getText().toString().trim();

        if (TextUtils.isEmpty(userName)) {
            Toast.makeText(this, "Enter email address!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Enter password!", Toast.LENGTH_SHORT).show();
            return;
        }
        loginPresenter.doLogin(userName,password);


    }
}
