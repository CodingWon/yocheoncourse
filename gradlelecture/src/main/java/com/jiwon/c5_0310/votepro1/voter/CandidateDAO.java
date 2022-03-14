package com.jiwon.c5_0310.votepro1.voter;

import com.jiwon.c5_0310.votepro1.candidate.domain.CandidateVO;

public class CandidateDAO {
    CandidateVO[] candidates;

    public CandidateDAO() {
        candidates = new CandidateVO[3];
        candidates[0] = new CandidateVO(1,"이재명","더불어민주당");
        candidates[1] = new CandidateVO(2,"윤석열","국민의 힘");
        candidates[2] = new CandidateVO(3, "심상정","정의당");
    }

    public CandidateVO[] getCandidates() {
        return candidates.clone();
    }

    public void check(Integer cno) throws Exception {

        for(CandidateVO vo : candidates){
            if(vo.getCno() == cno)
                return;
        }
        throw  new Exception("후보자가 없습니다.");
    }
}
