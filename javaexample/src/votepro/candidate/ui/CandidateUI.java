package votepro.candidate.ui;

import votepro.candidate.domain.CandidateVO;
import votepro.candidate.service.CandidateService;

import java.util.Arrays;

public class CandidateUI {
    CandidateService candidateService;

    public void display(){
        CandidateVO[] candidates = candidateService.showCandidate();

        Arrays.stream(candidates).forEach(vo -> System.out.println());
    }
}
