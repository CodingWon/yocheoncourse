package com.jiwon.c3_0307.piggy.my;

public class Main {
    public static void main(String[] args) {
        PiggySave piggySave = new PiggySave();
        PiggyUI piggyUI = new PiggyUI(piggySave);

        piggyUI.greety();
    }
}
