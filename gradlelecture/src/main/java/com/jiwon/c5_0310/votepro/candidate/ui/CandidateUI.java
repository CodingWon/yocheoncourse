package com.jiwon.c5_0310.votepro.candidate.ui;

import com.jiwon.c5_0310.votepro.candidate.domain.CandidateVO;
import com.jiwon.c5_0310.votepro.candidate.service.CandidateService;
import com.jiwon.c5_0310.votepro.ui.BasicUI;
import lombok.AllArgsConstructor;

import java.util.Arrays;


public class CandidateUI extends BasicUI {

    private CandidateService candidateService = CandidateService.INSTANCE;

    @Override
    public void display(){
        CandidateVO[] candidates = candidateService.getCandidate();
        System.out.println("____후보____");
        Arrays.stream(candidates).forEach(vo -> System.out.println("|"+vo.getCno() + "." + vo.getName() + "|"));
        System.out.println("----------");
    }
}
