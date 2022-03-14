package com.jiwon.c5_0310.votepro1.vote.ui;


import com.jiwon.c5_0310.votepro1.candidate.service.CandidateService;
import com.jiwon.c5_0310.votepro1.vote.service.VoteService;
import com.jiwon.c5_0310.votepro1.voter.domain.VoterVO;
import com.jiwon.c5_0310.votepro1.voter.service.VoterService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.Arrays;
import java.util.Scanner;

@RequiredArgsConstructor
public class VoteUI {

    @NonNull
    private VoteService voteService;
    @NonNull
    private VoterService voterService;
    @NonNull
    private CandidateService candidateService;
    @NonNull
    private Scanner scanner;

    public void play(){
        Integer vno = inputInt("유권자 번호를 입력하세요");
        VoterVO voterVO =  voterService.checkVoter(vno);

        if(voterVO == null){
            System.out.println("번호를 확인해주세요");
            play();
        }

        Arrays.stream(candidateService.getCandidate()).forEach(vo -> System.out.println(vo));
        Integer cno = inputInt("후보자 번호를 입력하세요");

        try {
            voteService.vote(vno,cno);
            System.out.println("투표가 완료 됬습니다.");
        } catch (Exception e) {
            System.out.println("문제가 발생 했습니다.");
            return;
        }

        String  oper = inputStr("계속 하시겠습니까(y/n)");

        if(oper.equals("n")){
            System.out.println("종료합니다.");
            return;
        }

        play();
    }

    private Integer inputInt(String msg){
        System.out.println(msg);
        Integer value = scanner.nextInt();
        return value;
    }

    private String inputStr(String msg){
        System.out.println(msg);
        String value = scanner.next();
        return value;
    }
}
