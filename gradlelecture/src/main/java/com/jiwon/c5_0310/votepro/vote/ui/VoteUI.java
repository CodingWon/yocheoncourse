package com.jiwon.c5_0310.votepro.vote.ui;

import com.jiwon.c5_0310.votepro.candidate.service.CandidateService;
import com.jiwon.c5_0310.votepro.ui.BasicUI;
import com.jiwon.c5_0310.votepro.vote.domain.VoteVO;
import com.jiwon.c5_0310.votepro.vote.service.VoteService;
import com.jiwon.c5_0310.votepro.voter.service.VoterService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Scanner;

public class VoteUI extends BasicUI {

    private VoteService voteService = VoteService.INSTANCE;

    private VoterService voterService = VoterService.INSTANCE;

    private CandidateService candidateService = CandidateService.INSTANCE;

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display(){
        System.out.println("유권자 번호를 입력하세요");
        Integer voterNum = Integer.parseInt(scanner.nextLine());

        try {
            voterService.readOne(voterNum);
        } catch (Exception e) {
            System.out.println("해당 번호의 유권자가 없습니다. 다시 확인해 주세요");
            display();
        }

        System.out.println("후보 번호를 입력하세요");
        Integer candidateNum = Integer.parseInt(scanner.nextLine());
        
        //후보자 번호를 확인 기능 필요

        VoteVO voteVO = new VoteVO(voterNum,candidateNum);

        try {
            voteService.vote(voteVO);
            System.out.println("정상적으로 투표가 완료 되었습니다.");
        } catch (Exception e) {
            System.out.println("투표에 문제가 생겼습니다.");
            return;
        }

        System.out.println("계속 하시겠습니까?(y/n)");
        String oper = scanner.nextLine();

        if(oper.equals("y"))
            display();

        return;
    }
}
