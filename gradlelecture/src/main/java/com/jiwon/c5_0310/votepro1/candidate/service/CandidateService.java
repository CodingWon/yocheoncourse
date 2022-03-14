package com.jiwon.c5_0310.votepro1.candidate.service;


import com.jiwon.c5_0310.votepro1.candidate.domain.CandidateVO;
import com.jiwon.c5_0310.votepro1.voter.CandidateDAO;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CandidateService {
    @NonNull
    private CandidateDAO candidateDAO;

    public CandidateVO[] getCandidate(){
        return candidateDAO.getCandidates();
    }
}
