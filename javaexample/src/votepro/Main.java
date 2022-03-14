package votepro;

import votepro.candidate.service.CandidateService;
import votepro.candidate.ui.CandidateUI;

public class Main {
    public static void main(String[] args) {

        CandidateService candidateService = new CandidateService();
        CandidateUI candidateUI = new CandidateUI(candidateService);
        candidateUI.display();
    }
}
