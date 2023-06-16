package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contactapp.databinding.ActivityAddingContactsBinding

class AddContacts : AppCompatActivity() {
    lateinit var binding:ActivityAddingContactsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddingContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            validateAddContact()
        }
    }
    fun validateAddContact() {
        val names = binding.etNames.text.toString()
        val phoneNumber = binding.etPhonenumber.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false
        if (names.isEmpty()) {
            binding.tillNames.error = "Namesrequired"
//            Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show();
            error = true
        }
//
        if (email.isEmpty()) {
            binding.tilEmail.error = "Password required"
//            Toast.makeText(this, "Please enter last name", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (email.isEmpty()) {
            binding.tilPhonenumber.error = "Phone Number required"
//            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (!error) {
            val intent=Intent(this,AddContacts::class.java)
//            val intent = Intent(this, AddingContacts::class.java)
            startActivity(intent)
        }
        Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show();
        finish();
    }
}

