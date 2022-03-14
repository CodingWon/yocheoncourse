package votepro.candidate.service;

import votepro.candidate.dao.CandidateDAO;
import votepro.candidate.domain.CandidateVO;

public class CandidateService {

    CandidateDAO candidateDAO = CandidateDAO.INSTANCE;
    public CandidateVO[] showCandidate(){
        return candidateDAO.getCandidats();
    }
}
