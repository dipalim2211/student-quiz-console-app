package com.devgen.quiz.client;

import com.devgen.quiz.model.QuizResult;
import com.devgen.quiz.service.QuestionService;
import com.devgen.quiz.service.QuizService;

public class QuizAppClient {

    public static void main(String[] args) {

        QuestionService questionService = new QuestionService(5); //Loosely Tight

        QuizService quizService = new QuizService(questionService);
        quizService.playQuiz();

        QuizResult quizResult = quizService.getResult();

        System.out.println("Total Correct Answer : "+quizResult.getCorrectAnswer());
        System.out.println("Total Incorrect Answer : "+quizResult.getIncorrectAnswer());
        System.out.println("Percentage : "+quizResult.getPercentage());
        System.out.println("Suggestion : "+quizResult.getSuggestion());


    }
}
