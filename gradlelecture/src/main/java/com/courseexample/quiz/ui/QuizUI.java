package com.courseexample.quiz.ui;

import com.courseexample.quiz.domain.Quiz;
import com.courseexample.quiz.repository.QuizRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;


public class QuizUI {


    private QuizRepository quizRepository;
    private Scanner sc;
    private int num;


    public QuizUI(QuizRepository quizRepository, Scanner sc) {
        this.quizRepository = quizRepository;
        this.sc = sc;
    }

    public void playQuiz (){
        Quiz[] quizzes = quizRepository.getQuiz();
        boolean correct =false;
        for(int i =0; i<quizzes.length; i++){
            System.out.println(quizzes[i].getTitle());
            System.out.println(quizzes[i].getDesc());
            correct = quizzes[i].checkAnswer(sc.nextLine().toUpperCase());

            if(correct){
                System.out.println("정답");
                System.out.println("-----------------");
                num++;
            }else {
                System.out.println("go back");
                break;
            }
        }

        System.out.println(num+" 개 맞추셨습니다.");
    }
}
