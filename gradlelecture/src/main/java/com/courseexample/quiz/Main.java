package com.courseexample.quiz;

import com.courseexample.quiz.repository.ExampleQuiz;
import com.courseexample.quiz.repository.MyRepository;
import com.courseexample.quiz.repository.QuizRepository;
import com.courseexample.quiz.ui.QuizUI;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc  = new Scanner(System.in);
        QuizRepository quiz = new MyRepository();
        QuizUI quizUI = new QuizUI(quiz,sc);

        quizUI.playQuiz();
    }
}
