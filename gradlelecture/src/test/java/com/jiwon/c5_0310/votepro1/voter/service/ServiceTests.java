package com.jiwon.c5_0310.votepro1.voter.service;

import com.jiwon.c5_0310.votepro1.voter.dao.VoterDAO;
import com.jiwon.c5_0310.votepro1.voter.domain.VoterVO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceTests {

    private VoterService voterService;
    @BeforeEach
    public void ready(){
        VoterDAO voterDAO = new VoterDAO();
        voterService = new VoterService(voterDAO);
    }

    @Test
    public void test1(){
        VoterVO vo = voterService.checkVoter(5);
        Assertions.assertNotNull(vo);
    }
}
