package com.jiwon.c5_0310.votepro.vote.dao;

import com.jiwon.c5_0310.votepro.vote.domain.VoteVO;
import com.jiwon.c5_0310.votepro.voter.dao.VoterDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DAOTests {

    private VoteDAO voteDAO;

    @BeforeEach
    public void ready(){
        voteDAO = VoteDAO.INSTANCE;
        for(int i = 1; i<=5; i++){
            voteDAO.add(new VoteVO(i,2));
        }

        for (int i = 6; i<=9; i++){
            voteDAO.add(new VoteVO(i,1));
        }

    }

    @Test
    public void testGetResult(){
        for (VoteVO voteVO : voteDAO.getResult()) {
            System.out.println(voteVO);
        }
    }
}
