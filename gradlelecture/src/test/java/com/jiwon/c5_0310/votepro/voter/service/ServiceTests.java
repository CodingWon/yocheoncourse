package com.jiwon.c5_0310.votepro.voter.service;

import com.jiwon.c5_0310.votepro.voter.dao.VoterDAO;
import com.jiwon.c5_0310.votepro.voter.domain.VoterVO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceTests {

    private VoterService voterService;

    @BeforeEach
    public void ready(){
//        voterService = new VoterService(new VoterDAO());
    }

    @Test
    public  void testReadOne()  {
        VoterVO vo = null;
        try {
            vo = voterService.readOne(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertNull(vo);
    }
}
