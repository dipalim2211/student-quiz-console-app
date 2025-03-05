package com.devgen.quiz.model;

//class holds Object related to your result after quiz

public class QuizResult {

    private int correctAnswer;
    private int incorrectAnswer;
    private double percentage;
    private String suggestion;

    //Constructor to get values from client

    public QuizResult(int correctAnswer, int incorrectAnswer, double percentage, String suggestion) {
        this.correctAnswer = correctAnswer;
        this.incorrectAnswer = incorrectAnswer;
        this.percentage = percentage;
        this.suggestion = suggestion;
    }

    //getter to get values only

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public int getIncorrectAnswer() {
        return incorrectAnswer;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSuggestion() {
        return suggestion;
    }
}
