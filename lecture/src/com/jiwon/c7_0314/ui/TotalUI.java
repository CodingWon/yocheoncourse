package com.jiwon.c7_0314.ui;


import java.util.Scanner;

public class TotalUI {

    private BasiceUI[] uis;
    private Scanner sc;

    public TotalUI(Scanner sc){
        this.sc = sc;
        uis = new BasiceUI[3];
        uis[0] = new ReadUI(sc);
        uis[1] = new RegisterUI(sc);
        uis[2] = new RemoveUI(sc);
    }

    public void play(){
        System.out.println("원하는 메뉴를 선택하세요 0.조회 1.등록 2.삭제 3.종료(-1)");
        int idx = sc.nextInt();
        if(idx == 3)
            return;

        uis[idx].excute();

        play();
    }
}
