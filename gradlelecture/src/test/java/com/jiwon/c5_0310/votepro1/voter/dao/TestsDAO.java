package com.jiwon.c5_0310.votepro1.voter.dao;

import com.jiwon.c5_0310.votepro1.candidate.domain.CandidateVO;
import com.jiwon.c5_0310.votepro1.voter.CandidateDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestsDAO {

    CandidateDAO candidateDAO;

    @BeforeEach
    public void ready(){
        candidateDAO = new CandidateDAO();
    }

    @Test
    public void test1(){
        CandidateVO[] candidateVO = candidateDAO.getCandidates();
        Assertions.assertEquals(candidateVO[0].getName(), "이재명");
        Arrays.stream(candidateVO).forEach(vo -> System.out.println(vo));
    }
}
