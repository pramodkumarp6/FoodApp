package com.pramod.foodapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.pramod.foodapp.databinding.ActivityUserForgetBinding
import com.pramod.foodapp.viewmodel.UserForgetViewModel

class UserForgetActivity : AppCompatActivity() {
    private lateinit var userForgetViewModel: UserForgetViewModel
    private lateinit var userforgetBinding: ActivityUserForgetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userforgetBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_forget)
        userForgetViewModel = ViewModelProvider(this).get(UserForgetViewModel::class.java)

    }
}