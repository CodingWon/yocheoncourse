package com.jiwon.c5_0310.votepro.voter.ui;

import com.jiwon.c5_0310.votepro.ui.BasicUI;
import com.jiwon.c5_0310.votepro.vote.domain.VoteVO;
import com.jiwon.c5_0310.votepro.vote.service.VoteService;

import java.util.ArrayList;
import java.util.Arrays;

public class VoterUI extends BasicUI {

    private VoteService voteService = VoteService.INSTANCE;

    @Override
    public void display(){
        ArrayList<VoteVO> arr = voteService.getResult();
        for(VoteVO vo : arr){
            System.out.println(vo);
        }
    }
}
