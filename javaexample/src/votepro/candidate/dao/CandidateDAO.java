package votepro.candidate.dao;

import votepro.candidate.domain.CandidateVO;

public enum CandidateDAO {
    INSTANCE;
    CandidateVO[] candidats;

    CandidateDAO() {
        candidats = new CandidateVO[3];
        candidats[0] = new CandidateVO(1, "이재명", "더불어민주당");
        candidats[1] = new CandidateVO(2,"윤석열","국민의힘");
        candidats[2] = new CandidateVO(3,"심상정","정의당");
    }

    //후보 목록 전달
    public CandidateVO[] getCandidats() {
        return candidats.clone();
    }
    //후보 확인


}
