package com.devgen.quiz.service;

//Maintaining Question-(CRUD)Create,Read,Update,Delete

import com.devgen.quiz.model.Question;

public class QuestionService {

    //system should have some question

    //store que in memory

    private Question[] questions = new Question[5];

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

    //Add Question
    public String addQuestion(Question question){
        return "Question Added Successfully";
    }

    //Update Question
    public String updateQuestion(Question question){
        return "Question Update Successfully";
    }

    //Delete Question(Use Id)
    public String deleteQuestion(int id){
        return "Question Deleted Successfully";
    }

    //All Question to pass QuizService
    public Question[] getAllQuestion(){
        return questions;
    }




}
