package com.sand_corporation.www.databindingusingbaseobservable;

public class MainViewModel {
    public String email, password;

    public MainViewModel() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
