package com.jiwon.c2_0304.arrayutil;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

//        Box box = new Box(4);
//
//        System.out.println(box.getOne());
//        System.out.println(box.getOne());
//        System.out.println(box.getOne());
//        System.out.println(box.getOne());


        String[] array = {"AAA","BBB","CCC","EEE","ZZZ"};
        String str = "EEE";

        int result = ArrayUtill.findIndex(array, str);

        System.out.println(result);

    }
}