package com.safaa.signup_assignment.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safaa.signup_assignment.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        
    }
}