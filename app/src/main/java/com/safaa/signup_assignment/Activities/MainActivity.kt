package com.safaa.signup_assignment.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safaa.signup_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            inBtn.setOnClickListener {
               val intent = Intent(this@MainActivity, SignInActivity::class.java)
               startActivity(intent)
            }

            inBtn.setOnClickListener {
                val intent = Intent(this@MainActivity, SignUpActivity::class.java)
                startActivity(intent)
            }

        }




    }
}