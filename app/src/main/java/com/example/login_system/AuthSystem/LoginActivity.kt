package com.example.login_system.AuthSystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login_system.NoteSystem.ui.NoteActivity
import com.example.login_system.R
import com.example.login_system.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

       binding.btnLogin.setOnClickListener {
           val intent = Intent(this, NoteActivity::class.java)
           startActivity(intent)
           finish()
       }
        binding.txReg.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}