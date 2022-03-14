package com.jiwon.c7_0314.ui;

import com.jiwon.c6_0311.ui.BasicUI;

import java.util.Scanner;

public class BasiceUI {

    Scanner scanner;

    public BasiceUI(Scanner scanner){
        this.scanner = scanner;
    }

    public int inputInt(String msg){
        String inputStr = input(msg);
        return Integer.parseInt(inputStr);
    }

    public String input(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public void excute(){

    }
}
