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

        val optionsListThree = ArrayList<Option>()
        optionsListThree.add(Option(1,"Toyota"))
        optionsListThree.add(Option(2,"Hyundai"))
        optionsListThree.add(Option(3,"Mitsubishi"))
        optionsListThree.add(Option(4,"Lada"))
        questionList.add(Question(3,"What carbrand is this?",R.drawable.hyundai,optionsListThree, "Hyundai"))

        val optionsListFour = ArrayList<Option>()
        optionsListFour.add(Option(1,"Iran"))
        optionsListFour.add(Option(2,"Iraq"))
        optionsListFour.add(Option(3,"Saudi arabia"))
        optionsListFour.add(Option(4,"Afghanistan"))
        questionList.add(Question(4,"What flag is this?",R.drawable.afghanistan,optionsListFour, "Afghanistan"))

        val optionsListFive = ArrayList<Option>()
        optionsListFive.add(Option(1,"GPU"))
        optionsListFive.add(Option(2,"CPU"))
        optionsListFive.add(Option(3,"PCU"))
        optionsListFive.add(Option(4,"Cooling fan"))
        questionList.add(Question(5,"What computer part is this?",R.drawable.gpu,optionsListFive, "GPU"))


        return questionList
    }
}