package com.jiwon.c5_0310.votepro.candidate.dao;

import com.jiwon.c5_0310.votepro.candidate.domain.CandidateVO;
import lombok.Getter;

@Getter
public enum CandidateDAO {
    INSTANCE;

    private CandidateVO[] candidates;

    CandidateDAO(){
        candidates = new CandidateVO[3];
        candidates[0] = new CandidateVO(1,"이재명");
        candidates[1] = new CandidateVO(2, "윤짜짱");
        candidates[2] = new CandidateVO(3,"심상정");
    }

    public CandidateVO[] getCandidates() {
        return candidates.clone();
    }

    public void check(Integer candidate) throws Exception {

        for(CandidateVO vo : candidates){
            if(candidate == vo.getCno()){
                return;
            }
        }
        throw new Exception("Cannot find candidate");
    }
}
