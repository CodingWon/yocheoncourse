package com.jiwon.c7_0314.ui;

import com.jiwon.c6_0311.ui.BasicUI;

import java.util.Scanner;

public class ReadUI extends BasicUI {

    public ReadUI(Scanner scaner) {
        super(scaner);
    }

    @Override
    public void execute() {
        System.out.println("조회 화면");
    }
}
