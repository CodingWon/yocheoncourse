package com.jiwon.c8_0315.quiz.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuizTests {

    @Test
    public void test2(){
        SubQuiz subQuiz = new SubQuiz();
        subQuiz.setTitle("임진왜란은 몇년도에");
        subQuiz.setAnswer("1");
        subQuiz.setArr(new String[]{"1492","1493","1943","1492"});

        System.out.println(subQuiz.getTitle());
        System.out.println(subQuiz.getDesc());

    }

    @Test
    public void test1(){
        Quiz quiz = OXQuiz.builder().build();
        quiz.setTitle("세종대왕은 한국 사람이다.");
        quiz.setAnswer("0");

        System.out.println(quiz.getDesc());


    }
}
