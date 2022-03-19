package com.courseexample.quiz.domain;

import lombok.Builder;

public class OXQuiz extends Quiz {
    @Override
    public void getDesc() {
        System.out.println("OX 퀴즈입니다.");
    }
}
