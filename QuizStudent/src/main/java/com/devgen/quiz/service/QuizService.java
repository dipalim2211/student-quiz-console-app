package com.devgen.quiz.service;

import com.devgen.quiz.model.Question;

import java.util.Scanner;

public class QuizService {

    private Question[] questions;

    //Input Answer should store for score calculation
    private String[] userSelectedAnswer = new String[5];

    public QuizService(){

        //To get all question from QuestionService call getAllQuestion
        
        QuestionService questionService = new QuestionService();
        questions=questionService.getAllQuestion();

    }

    public void playQuiz() {

        Scanner sc =new Scanner(System.in);

        //Display id , Question and Option
        for (int i = 0; i < questions.length; i++) {

            //Print Question
            System.out.println("Question NUmber : " + questions[i].getId());
            System.out.print(questions[i].getQuestion());

            //Display Option
            System.out.println();
            System.out.println(questions[i].getOption1());
            System.out.println(questions[i].getOption2());
            System.out.println(questions[i].getOption3());
            System.out.println(questions[i].getOption4());

            //Take input from Student
            System.out.println("Enter Your Answer");
            userSelectedAnswer[i]= sc.next();


        }
        sc.close();
    }

    //Score comparison Calculation

    public void printFinalScore()
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

        System.out.println();
        System.out.println("Correct Answer : "+correctAnswers);
        System.out.println("Incorrect Answer : "+incorrectAnswer);
        System.out.println("Percentage : "+percentage);
    }

}
