package com.jiwon.c8_0315.quiz.repository;

import com.jiwon.c8_0315.quiz.domain.OXQuiz;
import com.jiwon.c8_0315.quiz.domain.Quiz;

public class SportsQuizRepositoryImpl implements QuizRepository{

    private Quiz[] quizzes;

    public SportsQuizRepositoryImpl(){
        quizzes = new Quiz[1];
        Quiz quiz = new OXQuiz();
        quiz.setTitle("축구는 스포츠이다.");
        quiz.setAnswer("O");

        quizzes[0] = quiz;
    }

    @Override
    public Quiz getNextQuiz() {
        return quizzes[0];
    }
}
