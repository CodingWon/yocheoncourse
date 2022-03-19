package com.courseexample.quiz.domain;

import lombok.Setter;

@Setter
public abstract class Quiz {
    private String title;
    private String answer;

    public boolean checkAnswer(String userAnswer) {
        return this.answer.equals(userAnswer);
    }
    public abstract String getDesc();
    public  String getTitle(){return this.title; }
}
