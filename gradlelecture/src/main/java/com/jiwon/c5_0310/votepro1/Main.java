package com.jiwon.c5_0310.votepro1;

import com.jiwon.c5_0310.votepro1.candidate.domain.CandidateVO;
import com.jiwon.c5_0310.votepro1.candidate.service.CandidateService;
import com.jiwon.c5_0310.votepro1.vote.dao.VoteDAO;
import com.jiwon.c5_0310.votepro1.vote.service.VoteService;
import com.jiwon.c5_0310.votepro1.vote.ui.VoteUI;
import com.jiwon.c5_0310.votepro1.voter.CandidateDAO;
import com.jiwon.c5_0310.votepro1.voter.dao.VoterDAO;
import com.jiwon.c5_0310.votepro1.voter.service.VoterService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VoteDAO voteDAO = new VoteDAO();
        VoterDAO voterDAO = new VoterDAO();
        CandidateDAO candidateDAO = new CandidateDAO();

        VoteService voteService = new VoteService(voteDAO,voterDAO,candidateDAO);
        VoterService voterService = new VoterService(voterDAO);
        CandidateService candidateService = new CandidateService(candidateDAO);

        VoteUI voteUI = new VoteUI(voteService,voterService,candidateService,new Scanner(System.in));

        voteUI.play();
    }
}
