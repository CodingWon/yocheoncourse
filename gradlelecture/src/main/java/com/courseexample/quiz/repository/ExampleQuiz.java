package com.courseexample.quiz.repository;

import com.courseexample.quiz.domain.OXQuiz;
import com.courseexample.quiz.domain.Quiz;

public class ExampleQuiz implements QuizRepository{

    private Quiz[] quizzes;

    public ExampleQuiz(){
        quizzes = new Quiz[1];
        OXQuiz oxQuiz = new OXQuiz();
        oxQuiz.setTitle("샘플");
        oxQuiz.setAnswer("O");

        quizzes[0] = oxQuiz;

    }
    @Override
    public Quiz[] getQuiz() {
        return this.quizzes.clone();
    }
}
