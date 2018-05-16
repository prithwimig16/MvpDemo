package com.prithwiraj.mvpdemo.model;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton

public class Credential {

    private String userName;
    private String password;

    @Inject
    public Credential(){

    }

    public void set(String userName,String password){
        this.userName=userName;
        this.password=password;
    }

    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
   public void clear(){
        userName=null;
        password=null;
   }
}
