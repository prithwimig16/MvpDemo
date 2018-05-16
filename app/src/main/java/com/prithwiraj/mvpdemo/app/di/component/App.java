package com.prithwiraj.mvpdemo.app.di.component;

import android.app.Application;

import com.prithwiraj.mvpdemo.app.di.component.ApplicationComponent;
import com.prithwiraj.mvpdemo.app.di.component.ApplicationModule;
import com.prithwiraj.mvpdemo.app.di.component.DaggerApplicationComponent;

import org.greenrobot.eventbus.EventBus;


public class App extends Application {


    private ApplicationComponent applicationComponent;
    public static EventBus bus;

    @Override
    public void onCreate() {
        super.onCreate();
        setUpInjector();


    }

    private void setUpInjector(){
        applicationComponent= DaggerApplicationComponent
                .builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
