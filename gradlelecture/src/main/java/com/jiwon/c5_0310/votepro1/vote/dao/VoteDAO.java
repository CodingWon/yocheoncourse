package com.jiwon.c5_0310.votepro1.vote.dao;

import com.jiwon.c5_0310.votepro1.vote.domain.VoteVO;

import java.util.ArrayList;

public class VoteDAO {
    private ArrayList<VoteVO> votes;

    public VoteDAO(){
        votes = new ArrayList<>();
    }

    public void add(VoteVO vo){
        votes.add(vo);
    }

    public ArrayList<VoteVO> getVotes(){
        return (ArrayList<VoteVO>) votes.clone();
    }
}
