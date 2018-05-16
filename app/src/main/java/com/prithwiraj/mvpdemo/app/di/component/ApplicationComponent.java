package com.prithwiraj.mvpdemo.app.di.component;
import android.app.Application;

import com.prithwiraj.mvpdemo.views.login.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})

public interface  ApplicationComponent {

    Application application();

    App app();


    void inject(ApplicationModule applicationModule);

   void inject(LoginActivity loginActivity);

}
