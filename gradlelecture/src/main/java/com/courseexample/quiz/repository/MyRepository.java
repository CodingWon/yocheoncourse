package com.courseexample.quiz.repository;

import com.courseexample.quiz.domain.MultipleQuiz;
import com.courseexample.quiz.domain.OXQuiz;
import com.courseexample.quiz.domain.Quiz;
import com.courseexample.quiz.domain.SubQuiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyRepository implements QuizRepository{

    private Quiz[] quizzes;

    public MyRepository() throws FileNotFoundException {
        File file = new File("C:\\Users\\JIwon\\IdeaProjects\\yocheoncourse\\gradlelecture\\src\\main\\java\\com\\courseexample\\quiz\\data\\quizdata.txt");
        Scanner scCount = new Scanner(file);
        int cnt = 0;

            while (scCount.hasNext()) {
                scCount.nextLine();
                cnt++;
            }

        Scanner scRead  = new Scanner(file);
        quizzes = new Quiz[cnt];
        System.out.println(quizzes.length);
        for(int i =0; i<quizzes.length; i++){
            String line = scRead.nextLine();
            String[] arr = line.split(",");

            String title = arr[1];
            String answer = arr[2];

            if(arr[0].equals("OX")){
                OXQuiz oxQuiz = new OXQuiz();
                quizzes[i] = oxQuiz;
            } else if(arr[0].equals("SUB")){
                SubQuiz subQuiz = new SubQuiz();
                quizzes[i] = subQuiz;
            }else if(arr[0].equals("MUL")){
                MultipleQuiz multipleQuiz = new MultipleQuiz();
                quizzes[i] = multipleQuiz;
            }

            quizzes[i].setTitle(title);
            quizzes[i].setAnswer(answer);

            if(arr.length>=4){
                String[] examples = new String[3];
                examples[0] = arr[3];
                examples[1] = arr[4];
                examples[2] = arr[5];
                quizzes[i].setArr(examples);
            }
        }

    }

    @Override
    public Quiz[] getQuiz() {
        return quizzes;
    }


}
