package com.jiwon.c5_0310.votepro1.voter.dao;

import com.jiwon.c5_0310.votepro1.voter.domain.VoterVO;

public class VoterDAO {
    private VoterVO[] voters;

    public VoterDAO() {
        voters = new VoterVO[5];
        voters[0] = new VoterVO(1,"김길동");
        voters[1] = new VoterVO(2,"고길동");
        voters[2] = new VoterVO(3,"장길동");
        voters[3] = new VoterVO(4,"방길동");
        voters[4] = new VoterVO(5, "구길동");
    }

    public VoterVO[] getVoters() {
        return voters.clone();
    }

    public void check(Integer vno) {
    }
}
