package com.jiwon.c8_0315.quiz.domain;

import lombok.Setter;

import javax.print.DocFlavor;

@Setter
public abstract class Quiz {
    protected String title;
    protected String answer;

    //문제 식별 기능 - 개별적으로 나눔
    public abstract String getDesc();

    // 구현은 각자 해야함
    // checkAnswer는 공통부분이 있어서 일반 상속
    public  boolean checkAnswer(String userAnswer){
        return this.answer.equals(userAnswer);
    }

    //
    public String getTitle(){
        return this.title;
    }

}
