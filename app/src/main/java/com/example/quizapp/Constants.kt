package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val options = ArrayList<Option>(4)
        options.add(Option(1,"Sweden"))
        options.add(Option(2,"Norway"))
        options.add(Option(3,"Finland"))
        options.add(Option(4,"Denmark"))
        questionList.add(Question(1,"What flag is this?",R.drawable.swedenFlag,options,1))
        options.clear()
        return questionList
    }
}