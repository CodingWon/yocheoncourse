package com.jiwon.c5_0310.votepro.vote.dao;

import com.jiwon.c5_0310.votepro.vote.domain.VoteVO;
import com.jiwon.c5_0310.votepro.voter.dao.VoterDAO;

import java.util.ArrayList;

public enum VoteDAO {
    INSTANCE;

    private ArrayList<VoteVO> voArrayList;

    VoteDAO(){
        voArrayList = new ArrayList<>();
    }

    public void add(VoteVO voteVO){
        voArrayList.add(voteVO);
    }

    public ArrayList<VoteVO> getResult(){
        return (ArrayList<VoteVO>) voArrayList.clone();
    }

    public void checkVote(Integer voter) {
    }
}
