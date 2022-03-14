package com.jiwon.c3_0307.piggy.lecture;

import java.util.Scanner;

public class PiggyUI {

    PiggySave piggySave;
    Scanner scanner;

    public PiggyUI(PiggySave piggySave){
        piggySave = piggySave;
        scanner = new Scanner(System.in);
    }

    public void greeting() {
        while (true) {
            System.out.println("1.입금, 2.출금, 3.종료");
            String oper = scanner.nextLine();

            switch (oper) {
                case "1":
                    input();
                    break;
                case "3":
                    return;
            }
        }
    }

    private void input() {
        System.out.println("얼마 입금하실려구요?");
        piggySave.deposit();
    }

}
