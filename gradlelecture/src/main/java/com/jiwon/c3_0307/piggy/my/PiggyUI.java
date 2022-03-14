package com.jiwon.c3_0307.piggy.my;

import java.util.Scanner;

public class PiggyUI {

    private PiggySave piggySave;
    private Scanner sc;

    PiggyUI(PiggySave piggySave){
        sc = new Scanner(System.in);
        this.piggySave = piggySave;
    }

    public void greety(){
        System.out.println("원하시는 메뉴를 선택하세요");
        System.out.println("1.입금, 2.출금, 3.종료");

        String menu = sc.nextLine();
        switch (menu){
            case "1":
                input();
                break;
            case "3":
                return;
        }
        greety();
    }

    public void input() {
        System.out.println("입금하실 금액을 입력해주세요");
        piggySave.deposit(sc.nextInt());
        System.out.println("계속 하시겠습니까?(y/n)");
        String oper =  sc.nextLine();
        if(oper.equals("n"))
            return;

        input();
    }
}
