package com.jiwon.c09;

public interface Ex1 {
    double RATE =0.33;

    double inc();

    default String getStr(){
        return "AAA";
    }
}
