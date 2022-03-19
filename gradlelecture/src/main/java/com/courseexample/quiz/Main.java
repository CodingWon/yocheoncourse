package com.courseexample.quiz;

import com.courseexample.quiz.repository.ExampleQuiz;
import com.courseexample.quiz.repository.QuizRepository;
import com.courseexample.quiz.ui.QuizUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        QuizRepository quiz = new ExampleQuiz();
        QuizUI quizUI = new QuizUI(quiz,new Scanner(System.in));

        quizUI.playQuiz();
    }
}
