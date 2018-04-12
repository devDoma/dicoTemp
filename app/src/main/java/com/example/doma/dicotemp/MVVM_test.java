package com.example.doma.dicotemp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.doma.dicotemp.databinding.ActivityMvvmTestBinding;
import com.example.doma.dicotemp.model.User;
import com.example.doma.dicotemp.viewmodel.UserModel;

public class MVVM_test extends AppCompatActivity {


    private ActivityMvvmTestBinding activityMvvmTestBinding;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mvvm_test);

        activityMvvmTestBinding = DataBindingUtil.setContentView(this,R.layout.activity_mvvm_test);
        UserModel userModel = new UserModel(new User("Email","Password"));
        activityMvvmTestBinding.setLogin(userModel);

    }
}
