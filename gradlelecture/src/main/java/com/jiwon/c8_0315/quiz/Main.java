package com.jiwon.c8_0315.quiz;

import com.jiwon.c8_0315.quiz.domain.Quiz;
import com.jiwon.c8_0315.quiz.repository.QuizRepository;
import com.jiwon.c8_0315.quiz.repository.SampleQuizRepositoryImpl;
import com.jiwon.c8_0315.quiz.repository.SportsQuizRepositoryImpl;
import com.jiwon.c8_0315.quiz.ui.QuizUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuizRepository repository = new SportsQuizRepositoryImpl();

        QuizUI quizUI = new QuizUI(repository,sc);
        quizUI.ready();
    }
}
