package com.jiwon.c3_0307.piggy.my;

public class PiggySave {

    private int money;

    PiggySave(){
        money = 0;
    }

    public void deposit(int money){
        this.money +=money;
    }
}
