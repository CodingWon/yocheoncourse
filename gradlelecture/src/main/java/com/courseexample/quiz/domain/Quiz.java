package com.courseexample.quiz.domain;


public abstract class  Quiz {
    protected String title;
    protected String answer;

    public boolean check(String userAnswer){
        return this.answer.equals(userAnswer);
    }

    abstract void printDesc();

    }
