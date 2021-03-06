package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.Constants.getQuestions
import com.example.quizapp.databinding.ActivityQuizQuestionBinding


class QuizQuestion : AppCompatActivity() {
    var totalSize: Int = 0
    var currentIteration: Int = 0
    var correctAnswer: String = ""
    var totalPoints: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityQuizQuestionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val questionList = getQuestions()

        totalSize = questionList.size
        binding.pb.max = totalSize

        nextQuestion(questionList, binding)

        binding.answerOne.setOnClickListener{
            checkScore(binding.answerOne.text.toString())
            currentIteration++
            nextQuestion(questionList, binding)
        }
        binding.answerTwo.setOnClickListener{
            checkScore(binding.answerTwo.text.toString())
            currentIteration++
            nextQuestion(questionList, binding)
        }
        binding.answerThree.setOnClickListener{
            checkScore(binding.answerThree.text.toString())
            currentIteration++
            nextQuestion(questionList, binding)
        }
        binding.answerFour.setOnClickListener{
            checkScore(binding.answerFour.text.toString())
            currentIteration++
            nextQuestion(questionList, binding)
        }

    }

    private fun nextQuestion(questionList: ArrayList<Question>, binding: ActivityQuizQuestionBinding){
        if(currentIteration >= totalSize){
            showFinishScreen()
        }else{
            binding.quizQuestion.setText(questionList[currentIteration].question)
            binding.image.setImageResource(questionList[currentIteration].image);

            binding.answerOne.setText(questionList[currentIteration].options[0].title);
            binding.answerTwo.setText(questionList[currentIteration].options[1].title);
            binding.answerThree.setText(questionList[currentIteration].options[2].title);
            binding.answerFour.setText(questionList[currentIteration].options[3].title);

            correctAnswer = questionList[currentIteration].correctAnswer

            binding.pb.setProgress(currentIteration+1)
            binding.pbText.setText((currentIteration + 1).toString() + "/" + totalSize.toString())
        }
    }
    private fun checkScore(answer: String){
        if(answer == correctAnswer){
            totalPoints++
        }
    }
    private fun showFinishScreen(){

        val myIntent = Intent(this, FinishScreen::class.java)
        myIntent.putExtra("name",getIntent().getStringExtra("name"));
        myIntent.putExtra("totalPoints",totalPoints);
        myIntent.putExtra("totalSize",totalSize);
        startActivity(myIntent)
        finish()
    }

}