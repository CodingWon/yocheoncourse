package com.jiwon.courseexample.quiz.domain;

import com.courseexample.quiz.domain.OXQuiz;
import com.courseexample.quiz.domain.Quiz;
import org.junit.jupiter.api.Test;

public class QuizTests {

    @Test
    public void test1(){
        Quiz quiz = new OXQuiz();
        quiz.setTitle("세종대왕");
        quiz.setAnswer("O");
        System.out.println(quiz.getTitle());
        quiz.getDesc();
    }
}
