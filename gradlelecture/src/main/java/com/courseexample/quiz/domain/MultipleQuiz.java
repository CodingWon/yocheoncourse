package com.courseexample.quiz.domain;

public class MultipleQuiz extends Quiz{

    private String[] arr;

    @Override
    public boolean check(String userAnswer) {
        boolean result = false;
        boolean answer = super.check(userAnswer);
        result = answer;

        if(!answer){
            int idx = 0;
            for(int i =0; i<arr.length; i++){
                if(arr[i].equals(userAnswer)){
                    idx = i;
                }
            }
            result = Integer.parseInt(userAnswer) == idx+1;
        }
        return result;
    }

    @Override
    void printDesc() {
        System.out.println("객관식 문제입니다.");
    }
}
