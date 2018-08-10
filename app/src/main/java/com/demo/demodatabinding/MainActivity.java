package com.demo.demodatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.demo.demodatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public String str = "MainActivityStr";
    private ActivityMainBinding mainBinding;
    private UserInfo userInfo;
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        userInfo = new UserInfo();
        mainBinding.setUserInfo(userInfo);
        mainBinding.setMainActivity(this);
        mainBinding.setEventHandler(new EventHandler());
    }

    public void onClick(View view){
        Toast.makeText(this, view.getId() + ">>onClick", Toast.LENGTH_SHORT).show();
        Log.d("tag", "userinfo.age:" + userInfo.age.get());
    }
}
