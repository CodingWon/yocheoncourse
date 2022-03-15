package com.courseexample.quiz.domain;

public class SubQuiz extends Quiz{

    @Override
    public boolean check(String userAnswer) {
        return super.check(userAnswer);
    }

    @Override
    void printDesc() {
        System.out.println("주관식 문제입니다.");
    }
}
