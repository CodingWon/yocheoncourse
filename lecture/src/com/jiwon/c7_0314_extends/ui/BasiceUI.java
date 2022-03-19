package com.jiwon.c7_0314_extends.ui;


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
