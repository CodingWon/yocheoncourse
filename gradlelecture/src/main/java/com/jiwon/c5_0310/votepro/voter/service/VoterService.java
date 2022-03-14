package com.jiwon.c5_0310.votepro.voter.service;

import com.jiwon.c5_0310.votepro.voter.dao.VoterDAO;
import com.jiwon.c5_0310.votepro.voter.domain.VoterVO;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


public enum VoterService {
    INSTANCE;

    private VoterDAO voterDAO = VoterDAO.INSTANCE;


    public VoterVO readOne(Integer vno) throws Exception{
        VoterVO vo = voterDAO.getOne(vno);

        if(vo == null){
            throw  new Exception("voter is null");
        }

        return vo;
    }


}
