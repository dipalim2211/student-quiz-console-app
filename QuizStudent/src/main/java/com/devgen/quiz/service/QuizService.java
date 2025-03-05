package com.devgen.quiz.service;

import com.devgen.quiz.model.Question;
import com.devgen.quiz.model.QuizResult;

import java.util.Scanner;

public class QuizService {

    private Question[] questions;

    private String[] userSelectedAnswer = new String[5]; //Input Answer should store for score calculation

    private QuestionService questionService;        //Loosely Coupled

    /*  Tightly Coupled with question service
    public QuizService(){

        //To get all question from QuestionService call getAllQuestion

        QuestionService questionService = new QuestionService();
        questions=questionService.getAllQuestion();
    }
    */

    //Loosely Coupled Using Constructor

    public QuizService(QuestionService questionService)        //By constructor call Dependency
    {
        this.questionService=questionService;
        questions=questionService.getAllQuestion();
    }


    public void playQuiz()
    {

        Scanner sc =new Scanner(System.in);

        //Display id , Question and Option
        for (int i = 0; i < questions.length; i++) {

            //Print Question
            System.out.println("Question NUmber : " + questions[i].getId());
            System.out.print(questions[i].getQuestion());

        /*    //Display Option
            System.out.println();
            System.out.println(questions[i].getOption1());
            System.out.println(questions[i].getOption2());
            System.out.println(questions[i].getOption3());
            System.out.println(questions[i].getOption4());
        */

            //Display Option
            System.out.println();
            for(String option:questions[i].getOptions())
            {
                System.out.println(option);
            }

            //Take input from Student
            System.out.println();
            System.out.println("Enter Your Answer");
            userSelectedAnswer[i]= sc.next();
        }
        sc.close();
    }

    //Score comparison Calculation

    public QuizResult getResult()
    {
        int correctAnswers=0;
        int incorrectAnswer=0;

        for(int i =0;i<userSelectedAnswer.length;i++)
        {
            if(questions[i].getAnswer().equals(userSelectedAnswer[i])){
                correctAnswers++;
            }
        }

        incorrectAnswer=questions.length-correctAnswers;

        double percentage = ((double) correctAnswers / questions.length) * 100;

        String suggestion =getSuggestion(percentage);

        QuizResult quizResult = new QuizResult(correctAnswers,incorrectAnswer,percentage,suggestion);

        return quizResult;

       /*
       System.out.println();
        System.out.println("Correct Answer : "+correctAnswers);
        System.out.println("Incorrect Answer : "+incorrectAnswer);
        System.out.println("Percentage : "+percentage);

        */
    }

    //Method not exposing to client-make private
    private String getSuggestion(double percentage)
    {
        String suggestion ="";

        if(percentage >=0 && percentage <=30)
        {
            suggestion = "Not good";
        } else if (percentage>=31 && percentage<=60) {
            suggestion = "good";
        } else if (percentage>=61 && percentage<=90) {
            suggestion = "Topper";
        }else {
            suggestion = "Very Good and Topped";
        }

        return suggestion;
    }

}
