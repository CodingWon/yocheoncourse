package com.jiwon.c8_0315.quiz.repository;

import com.jiwon.c8_0315.quiz.domain.OXQuiz;
import com.jiwon.c8_0315.quiz.domain.Quiz;

import java.util.Scanner;

public class SampleQuizRepositoryImpl implements QuizRepository {

    private Quiz[] quizzes;
  

    public SampleQuizRepositoryImpl(){

        int cnt = 0;

        quizzes = new Quiz[10];
        OXQuiz oxQuiz = new OXQuiz();
        oxQuiz.setTitle("지금 이곳은 윤석열의 세상입니다.");
        oxQuiz.setAnswer("O");

        quizzes[0] = oxQuiz;
    }

    @Override
    public Quiz getNextQuiz() {
        return quizzes[0];
    }
}
