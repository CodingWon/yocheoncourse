package com.jiwon.c8_0315.quiz.ui;

import com.jiwon.c8_0315.quiz.domain.Quiz;
import com.jiwon.c8_0315.quiz.repository.QuizRepository;
import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class QuizUI {
    private QuizRepository repository;
    private Scanner sc;

    public void ready()  {
        System.out.println("어떤 종류의 문제를 푸로 싶으신가요 ?");
        String category = sc.nextLine();

        String className = "com.jiwon.c8_0315.quiz.repository." + category+"QuizRepositoryImpl";

        try {
            repository = (QuizRepository) Class.forName(className).getConstructors()[0].newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        play();
    }

    public void play(){
        // Quiz 의 상속된 클래스를 반환
        Quiz quiz = repository.getNextQuiz();
        System.out.println(quiz.getTitle());
        System.out.println(quiz.getDesc());

        String userAnswer = sc.nextLine();

        boolean correct = quiz.checkAnswer(userAnswer);
        if(!correct){
            System.out.println("Back Home");
            return;
        }
        play();

    }

}
