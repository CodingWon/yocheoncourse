package com.jiwon.c5_0310.votepro.ui;

import com.jiwon.c5_0310.votepro.candidate.ui.CandidateUI;
import com.jiwon.c5_0310.votepro.vote.ui.VoteUI;
import com.jiwon.c5_0310.votepro.voter.ui.VoterUI;

import java.util.Scanner;

public class TotalUI {

    BasicUI[] uis;
    Scanner sc;

    public TotalUI(){
        uis = new BasicUI[3];
        uis[0] = new CandidateUI();
        uis[1] = new VoteUI();
        uis[2] = new VoterUI();
       sc = new Scanner(System.in);
    }
    public void play(){
        System.out.println("------------- 투표 프로그램 --------------");
        System.out.printf("1.후보자 보기\n2.투표하기\n3.투표결과\n4.종료\n");
        int idx = Integer.parseInt(sc.nextLine());
        if(idx == 4)
            return;
        idx--;
        uis[idx].display();

        play();
    }

}
