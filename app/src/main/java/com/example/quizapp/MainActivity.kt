package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonStart.setOnClickListener {

            if(validateName(binding.name.text.toString(), binding) != "ERROR"){
                val myIntent = Intent(this, QuizQuestion::class.java)
                myIntent.putExtra("name",binding.name.text.toString());
                startActivity(myIntent)
                finish()
            }
        }
    }

    private fun validateName(name: String, binding: ActivityMainBinding): String? {
        var username: String = "ERROR"
        if (!name.isNullOrEmpty()){
            username = name.toString().trim()
        } else {
            showError(binding)
        }
        return username
    }

    private fun showError(binding: ActivityMainBinding){
        binding.name.setText("ERROR")
    }

}