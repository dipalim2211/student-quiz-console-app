package com.devgen.quiz.service;

import com.devgen.quiz.model.Question;

public class QuestionServiceClient {

    public static void main(String[] args) {

        QuestionService questionService = new QuestionService(7);

        Question question1 = new Question(6,"Java Born Year",new String[]{"1885","1920","1995","2004"},3);
        questionService.addQuestion(question1);

        Question question2 = new Question(7,"Array Index Starts with ",new String[]{"0","1"},1);
        questionService.addQuestion(question2);


        //Update Question
        Question[] questions =questionService.getAllQuestion();
        Question originalQuestion  =questions[2];
        originalQuestion.setAnswer(2);
        originalQuestion.setQuestion("Size of float data type is : ");

        questionService.updateQuestion(originalQuestion);

        questions = questionService.getAllQuestion();
        for(Question q : questions)
            System.out.println(q);

        System.out.println("----------**********-------------");
        //Delete Question
        questionService.deleteQuestion(4);

        questions = questionService.getAllQuestion();
        for(Question q1 : questions)
            System.out.println(q1);


    }



}
