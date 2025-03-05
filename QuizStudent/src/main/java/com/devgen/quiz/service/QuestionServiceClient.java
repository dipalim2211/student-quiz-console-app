package com.devgen.quiz.service;

import com.devgen.quiz.model.Question;

public class QuestionServiceClient {

    public static void main(String[] args) {

        QuestionService questionService = new QuestionService(10);

        Question question1 = new Question(6,"Java Born Year",new String[]{"1885","1920","1995","2004"},"1995");
        questionService.addQuestion(question1);

        Question question2 = new Question(7,"Java Born Year",new String[]{"1885","1920","1995","2004"},"1995");
        questionService.addQuestion(question2);


    }



}
