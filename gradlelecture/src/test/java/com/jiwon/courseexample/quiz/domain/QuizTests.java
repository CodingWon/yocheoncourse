package com.jiwon.courseexample.quiz.domain;

import com.courseexample.quiz.domain.MultipleQuiz;
import com.courseexample.quiz.domain.OXQuiz;
import com.courseexample.quiz.domain.Quiz;
import com.jiwon.c8_0315.quiz.domain.SubQuiz;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuizTests {

    @Test
    public void test1(){
        Quiz quiz = new OXQuiz();
        quiz.setTitle("세종대왕");
        quiz.setAnswer("O");
        System.out.println(quiz.getTitle());
        quiz.getDesc();
    }

    @Test
    public void test2(){
        MultipleQuiz multipleQuiz = new MultipleQuiz();
        multipleQuiz.setTitle("임진왜란?");
        multipleQuiz.setArr(new String[]{"1422","2233"});
        multipleQuiz.setAnswer("1");
        System.out.println(multipleQuiz.getTitle());
        System.out.println(Arrays.toString(multipleQuiz.getArr()));
        System.out.println(multipleQuiz.checkAnswer("1422"));
    }
}
