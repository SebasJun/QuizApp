package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityFinishScreenBinding

class FinishScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFinishScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.name.setText(getIntent().getStringExtra("name") + " has finished with...")

        val totalPoints: String = getIntent().getIntExtra("totalPoints", 0).toString()
        val totalSize: String = getIntent().getIntExtra("totalSize", 0).toString()

        val totalScore = totalPoints + "/" + totalSize + " total score!"

        binding.totalpoints.setText(totalScore)

        binding.cancel.setOnClickListener{
            System.exit(-1)
        }
        binding.play.setOnClickListener{
            val myIntent = Intent(this, QuizQuestion::class.java)
            myIntent.putExtra("name",getIntent().getStringExtra("name"));
            startActivity(myIntent)
            finish()
        }



    }
}