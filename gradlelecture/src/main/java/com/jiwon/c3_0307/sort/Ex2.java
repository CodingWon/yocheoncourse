package com.jiwon.c3_0307.sort;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        Integer[] arr ={100,32,54,26,23,11};
        Arrays.sort(arr , (a,b) -> a-b);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr , (a,b) -> b-a);
        System.out.println(Arrays.toString(arr));
    }
}
