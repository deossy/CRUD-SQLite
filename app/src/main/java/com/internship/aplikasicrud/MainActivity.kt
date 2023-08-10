package com.internship.aplikasicrud

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            val db = DatabaseHandler(this)
            val user = User(
                name = binding.etName.text.toString(),
                phoneNum = binding.etNohp.text.toString(),
                email = binding.etAddress.text.toString()
            )
            db.insertUser(user)
            Toast.makeText(this, "Berhasil Menambahkan ke dalam DB", Toast.LENGTH_LONG).show()
        }
    }
}