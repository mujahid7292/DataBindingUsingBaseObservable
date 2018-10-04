package com.sand_corporation.www.databindingusingbaseobservable;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class MainViewModel extends BaseObservable {
    public String email, password;

    public MainViewModel() {

    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }
}
