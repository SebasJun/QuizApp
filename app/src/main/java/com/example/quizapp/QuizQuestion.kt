package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.Constants.getQuestions
import com.example.quizapp.databinding.ActivityQuizQuestionBinding


class QuizQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityQuizQuestionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val questionList = getQuestions()
        binding.quizQuestion.setText(questionList[0].question)
        binding.image.setImageResource(R.drawable.swedenFlag);

    }
}