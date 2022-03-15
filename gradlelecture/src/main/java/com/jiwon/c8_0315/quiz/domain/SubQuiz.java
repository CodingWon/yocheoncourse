package com.jiwon.c8_0315.quiz.domain;

import lombok.Setter;

import java.util.Arrays;

@Setter
public class SubQuiz extends Quiz{

    private String [] arr;

    @Override
    public String getDesc() {
        return Arrays.toString(arr);
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        boolean condition1 = super.checkAnswer(userAnswer);

        // 객관식 번호가 일치하면 종료
        if(condition1)
            return true;

        //사용자가 1443 으로 입력 했을 때 배열 인덱스를 찾아낸다.
        int userIdx = -1;
        for(int i =0; i<arr.length; i++){
            if(userAnswer.equals(arr[i])){
                userIdx = i;
                break;
            }
        }
        // 배열 인덱스와 사용자가 입력한 번호가 일치 한지 확인
        boolean condition2 = userIdx + 1 == Integer.parseInt(userAnswer);

        if(condition2){
            return true;
        }
        return false;
    }
}
