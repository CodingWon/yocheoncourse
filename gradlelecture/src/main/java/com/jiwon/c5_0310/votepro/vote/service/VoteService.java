package com.jiwon.c5_0310.votepro.vote.service;

import com.jiwon.c5_0310.votepro.candidate.dao.CandidateDAO;
import com.jiwon.c5_0310.votepro.vote.dao.VoteDAO;
import com.jiwon.c5_0310.votepro.vote.domain.VoteVO;
import com.jiwon.c5_0310.votepro.voter.dao.VoterDAO;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@RequiredArgsConstructor
public enum VoteService {
    INSTANCE;

    private VoterDAO voterDAO = VoterDAO.INSTANCE;
    private CandidateDAO candidateDAO =CandidateDAO.INSTANCE;
    private VoteDAO voteDAO = VoteDAO.INSTANCE;

    public void vote(VoteVO voteVO) throws Exception {
        // 후보자 확인
        Integer candidate = voteVO.getCandidate();
        candidateDAO.check(candidate);
        //투표자 확인
        Integer voter = voteVO.getVoter();
        voterDAO.check(voter);

        //투표 여부 확인
        voteDAO.checkVote(voter);
        voteDAO.add(voteVO);
    }

    public ArrayList<VoteVO> getResult(){
        return voteDAO.getResult();
    }
}
