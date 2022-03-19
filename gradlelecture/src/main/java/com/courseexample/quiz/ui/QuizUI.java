package com.courseexample.quiz.ui;

import com.courseexample.quiz.domain.Quiz;
import com.courseexample.quiz.repository.QuizRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class QuizUI {

    @NonNull
    private QuizRepository quizRepository;
    @NonNull
    private Scanner sc;

    public void playQuiz (){
        Quiz[] quiz = quizRepository.getQuiz();
        System.out.println(quiz[0].getTitle());
        System.out.println(quiz[0].getDesc());
        boolean correct = quiz[0].checkAnswer(sc.nextLine());

        if(correct){
            System.out.println("정답");
            System.out.println("-----------------");
            playQuiz();
        }

        System.out.println("go back");
        return;
    }
}
