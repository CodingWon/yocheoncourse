package com.jiwon.c8_0315.quiz.domain;

import lombok.Builder;


public class OXQuiz extends Quiz {

    @Override
    public String getDesc(){
        return "O or X";
    }

    // OX는 부모꺼를 사용 하면 된다.
//    @Override
//    public boolean checkAnswer(String userAnswer){
//
//    }

}
