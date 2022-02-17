package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

       val optionsListOne = ArrayList<Option>()
        optionsListOne.add(Option(1,"Sweden"))
        optionsListOne.add(Option(2,"Norway"))
        optionsListOne.add(Option(3,"Finland"))
        optionsListOne.add(Option(4,"Denmark"))
        questionList.add(Question(1,"What flag is this?",R.drawable.sweden_flag,optionsListOne, "Sweden"))

        val optionsListTwo = ArrayList<Option>()
        optionsListTwo.add(Option(1,"Wombat"))
        optionsListTwo.add(Option(2,"Capybara"))
        optionsListTwo.add(Option(3,"Quokka"))
        optionsListTwo.add(Option(4,"Lemur"))
        questionList.add(Question(2,"What animal is this?",R.drawable.quokka,optionsListTwo, "Quokka"))


        return questionList
    }
}