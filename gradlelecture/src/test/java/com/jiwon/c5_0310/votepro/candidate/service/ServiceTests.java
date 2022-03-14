package com.jiwon.c5_0310.votepro.candidate.service;

import com.jiwon.c5_0310.votepro.candidate.dao.CandidateDAO;
import com.jiwon.c5_0310.votepro.candidate.domain.CandidateVO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ServiceTests {
    private CandidateService service;

    @BeforeEach
    public void ready(){
        CandidateDAO dao = new CandidateDAO();
        service = new CandidateService(dao);
    }

    @Test
    public void test1(){
        Assertions.assertNotNull(service);
    }

    @Test
    public void test후보자읽기(){
        CandidateVO[] arr = service.getCandidate();
//        for(CandidateVO vo : arr){
//            System.out.println(vo);
//        }
        Arrays.stream(service.getCandidate()).forEach(vo -> System.out.println(vo));
    }
}
