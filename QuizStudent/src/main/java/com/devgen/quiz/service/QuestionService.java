package com.devgen.quiz.service;

//Maintaining Question-(CRUD)Create,Read,Update,Delete

import com.devgen.quiz.model.Question;

public class QuestionService {

    //system should have some question

    //store que in memory

//    private Question[] questions = new Question[10];
    private Question[] questions;
    private int arrayIndex;

    public QuestionService(int size)
    {

        //Define Size of Array
        questions =new  Question[size];

        initializeDefaultQuestions();

        /*
        //Constructor : Initialize Question(Object)

        questions[arrayIndex]= new Question(1,"Size of short data type",new String[]{"2","4","1","8"},1);
        arrayIndex++;
        questions[arrayIndex]= new Question(2,"Size of int data type",new String[]{"2","4"},2);
        arrayIndex++;
        questions[arrayIndex]= new Question(3,"Size of float data type",new String[]{"2","4","1","8"},2);
        arrayIndex++;
        questions[arrayIndex++]= new Question(4,"Size of double data type",new String[]{"2","4","1","8"},4);
        questions[arrayIndex++]= new Question(5,"Size of char data type",new String[]{"2","4"},1);
         */
         

        /*
        for(int i =0;i<questions.length;i++)
        {
            System.out.println(questions[i]);
        }
        */

    }

    private void initializeDefaultQuestions()       //commit as init method
    {
        questions[arrayIndex]= new Question(1,"Size of short data type",new String[]{"2","4","1","8"},1);
        arrayIndex++;
        questions[arrayIndex]= new Question(2,"Size of int data type",new String[]{"2","4"},2);
        arrayIndex++;
        questions[arrayIndex]= new Question(3,"Size of float data type",new String[]{"2","4","1","8"},2);
        arrayIndex++;
        questions[arrayIndex++]= new Question(4,"Size of double data type",new String[]{"2","4","1","8"},4);
        questions[arrayIndex++]= new Question(5,"Size of char data type",new String[]{"2","4"},1);

    }


    //Add Question
    public String addQuestion(Question question){
        int length = questions.length;
        questions[arrayIndex]=question;
        arrayIndex++;


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
