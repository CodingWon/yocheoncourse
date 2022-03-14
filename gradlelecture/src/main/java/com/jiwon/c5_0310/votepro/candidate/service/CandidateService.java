package com.jiwon.c5_0310.votepro.candidate.service;

import com.jiwon.c5_0310.votepro.candidate.dao.CandidateDAO;
import com.jiwon.c5_0310.votepro.candidate.domain.CandidateVO;


public enum CandidateService {
    INSTANCE;

    private CandidateDAO candidateDAO = CandidateDAO.INSTANCE;

    public CandidateVO[] getCandidate(){

        return candidateDAO.getCandidates();
    }
}
