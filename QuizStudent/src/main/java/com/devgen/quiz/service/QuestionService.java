package com.devgen.quiz.service;

//Maintaining Question-(CRUD)Create,Read,Update,Delete

import com.devgen.quiz.model.Question;

import java.util.Scanner;

public class QuestionService {

    //system should have some question

    //store que in memory

    private Question[] questions = new Question[5];

    //Input Answer should store for score calculation

    private String[] userSelectedAnswer = new String[5];

    Scanner sc =new Scanner(System.in);

    public QuestionService() {

        //Constructor : Initialize Question(Object)

        questions[0]= new Question(1,"Size of short data type","2","4","1","8","2");
        questions[1]= new Question(2,"Size of int data type","2","4","1","8","4");
        questions[2]= new Question(3,"Size of float data type","2","4","1","8","4");
        questions[3]= new Question(4,"Size of double data type","2","4","1","8","8");
        questions[4]= new Question(5,"Size of char data type","2","4","1","8","2");

        /*
        for(int i =0;i<questions.length;i++)
        {
            System.out.println(questions[i]);
        }
        */


        }

    public void playQuiz() {

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
