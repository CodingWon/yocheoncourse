package com.jiwon.c7_0314.ui;

import com.jiwon.c6_0311.ui.BasicUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TotalUI totalUI = new TotalUI(sc);

        totalUI.play();

    }
}
