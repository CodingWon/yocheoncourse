package com.jiwon.c09;

public class Main {
    public static void main(String[] args) {
        System.out.println(Ex1.RATE);

        Ex1 ex1 =new Ex1() {
            @Override
            public double inc() {
                return 0;
            }
        };

    }
}
