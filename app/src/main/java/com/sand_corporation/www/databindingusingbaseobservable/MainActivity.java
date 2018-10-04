package com.sand_corporation.www.databindingusingbaseobservable;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sand_corporation.www.databindingusingbaseobservable.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        MainViewModel viewModel = new MainViewModel();
        viewModel.setEmail("mujahid7292@gmail.com");
        viewModel.setPassword("123456");
        mainBinding.setMainViewModel(viewModel);
    }
}
