package votepro.candidate.ui;

import votepro.candidate.domain.CandidateVO;
import votepro.candidate.service.CandidateService;
import votepro.ui.BasicUI;

import java.util.Arrays;

public class CandidateUI implements BasicUI {
    CandidateService candidateService;

    public CandidateUI(CandidateService candidateService){
        this.candidateService = candidateService;
    }
    @Override
    public void display(){
        CandidateVO[] candidates = candidateService.showCandidate();
        Arrays.stream(candidates).forEach(vo -> System.out.println("기호"+vo.getCno() +"번 " + vo.getName() + "," + vo.getParty()));
    }
}
