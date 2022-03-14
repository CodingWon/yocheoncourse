package com.jiwon.c5_0310.votepro1.vote.service;

import com.jiwon.c5_0310.votepro1.vote.dao.VoteDAO;
import com.jiwon.c5_0310.votepro1.vote.domain.VoteVO;
import com.jiwon.c5_0310.votepro1.voter.CandidateDAO;
import com.jiwon.c5_0310.votepro1.voter.dao.VoterDAO;
import com.jiwon.c5_0310.votepro1.voter.domain.VoterVO;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VoteService {
    @NonNull
    private VoteDAO voteDAO;
    @NonNull
    private VoterDAO voterDAO;
    @NonNull
    private CandidateDAO candidateDAO;


    public void vote(Integer vno, Integer cno) throws Exception{

        voterDAO.check(vno);

        candidateDAO.check(cno);

        VoteVO voteVo = new VoteVO(vno,cno);
        voteDAO.add(voteVo);
    }

}
