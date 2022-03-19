package com.courseexample.quiz.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class MultipleQuiz extends Quiz{

    private String[] arr;

    @Override
    public String getDesc() {
        return Arrays.toString(arr);
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        boolean check = super.checkAnswer(userAnswer);
        boolean result = check;

        if(!check){
            int tmp = -1;
           for (int i = 0; i<arr.length; i++){
               if(arr[i].equals(userAnswer)){
                    tmp = i;
                    break;
               }
            }
            result = super.checkAnswer((tmp+1)+"");
        }
        return result;
    }
}
