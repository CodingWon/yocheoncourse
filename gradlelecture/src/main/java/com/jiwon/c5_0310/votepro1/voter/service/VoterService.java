package com.jiwon.c5_0310.votepro1.voter.service;

import com.jiwon.c5_0310.votepro1.voter.dao.VoterDAO;
import com.jiwon.c5_0310.votepro1.voter.domain.VoterVO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VoterService {
    private VoterDAO voterDAO;


    public VoterVO checkVoter(Integer vno){
        VoterVO[] arr = voterDAO.getVoters();
        VoterVO result = null;
        for(VoterVO vo : arr){
            if(vo.getVno() == vno){
                result = vo;
            }
        }
        return result;
    }

}
