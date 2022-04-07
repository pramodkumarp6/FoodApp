package com.pramod.foodapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.pramod.foodapp.R
import com.pramod.foodapp.databinding.ActivityLoginBinding
import com.pramod.foodapp.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         val loginBinding: ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
         val loginViewModel:  LoginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

    }
}