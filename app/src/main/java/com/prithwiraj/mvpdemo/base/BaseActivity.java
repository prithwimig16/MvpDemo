package com.prithwiraj.mvpdemo.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.prithwiraj.mvpdemo.app.di.component.App;
import com.prithwiraj.mvpdemo.app.di.component.ApplicationComponent;


import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    protected ApplicationComponent applicationComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
       applicationComponent = ((App) getApplication()).getApplicationComponent();
        intDagger();
        initPresenter();

    }

     protected abstract boolean canDisplayBackButton();
    protected abstract void initPresenter();
    protected abstract int getLayoutId();
     protected abstract void intDagger();
    protected abstract int initialize(Bundle bundle);
}
