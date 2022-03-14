package com.jiwon.c3_0307.sort;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        ExamResult[] arr = new ExamResult[4];
        arr[0] = new ExamResult("국어",87);
        arr[1] = new ExamResult("영어",66);
        arr[2] = new ExamResult("수학",34);
        arr[3] = new ExamResult("사탐",94);

        // 1) 점수가 높은 대로
        Arrays.sort(arr, (a,b) -> b.score - a.score );
        System.out.println(Arrays.toString(arr));

        // 2) 과목명
        Arrays.sort(arr, (a,b) -> a.subject.compareTo(b.subject));
        System.out.println(Arrays.toString(arr));

        //3) 특정 점수와 가까울 때
        int target = 70;
        Arrays.sort(arr, (a,b) -> Math.abs(a.score-target) - Math.abs(b.score-target));
        System.out.println(Arrays.toString(arr));
    }
}
