package com.jiwon.c5_0310.votepro.candidate;

import com.jiwon.c5_0310.votepro.candidate.dao.CandidateDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DAOTests {

    private CandidateDAO dao;

    @BeforeEach
    public void ready(){
        System.out.println("ready .....");
        dao = CandidateDAO.INSTANCE;
    }

    @Test
    public void test1(){
        dao.getCandidates()[1].getName();
        Assertions.assertEquals(dao.getCandidates()[1].getName() , "윤짜짱");
//        System.out.println(Arrays.toString(dao.getCandidates()));

        Arrays.stream(dao.getCandidates()).forEach(vo -> System.out.println(vo));
    }
}
