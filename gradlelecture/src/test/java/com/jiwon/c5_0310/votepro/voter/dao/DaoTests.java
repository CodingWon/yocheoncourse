package com.jiwon.c5_0310.votepro.voter.dao;

import com.jiwon.c5_0310.votepro.voter.domain.VoterVO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DaoTests {

    private VoterDAO voterDAO;

    @BeforeEach
    public void ready(){
        voterDAO = new VoterDAO();
    }

    @Test
    public void test1(){
        Assertions.assertEquals(voterDAO.getOne(1).getName(),"김지원");
        Assertions.assertEquals(voterDAO.getOne(10).getName(),"홍길동");
    }
}
