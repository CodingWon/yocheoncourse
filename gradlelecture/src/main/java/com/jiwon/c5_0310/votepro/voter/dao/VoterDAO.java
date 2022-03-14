package com.jiwon.c5_0310.votepro.voter.dao;

import com.jiwon.c5_0310.votepro.voter.domain.VoterVO;

public enum VoterDAO {
    INSTANCE;
    private VoterVO[] voters;

    VoterDAO(){
        voters = new VoterVO[5];
        voters[0] = new VoterVO(1,"김지원", 31);
        voters[1] = new VoterVO(2,"장동한",31);
        voters[2] = new VoterVO(3, "김연아", 33);
        voters[3] = new VoterVO(4, "방진우" , 31);
        voters[4] = new VoterVO(5,"박선령",25);
    }

    public VoterVO getOne(Integer vno){
        VoterVO result = null;
        for(VoterVO vo : voters)
            if(vo.getVno() == vno){
                result = vo;
                break;
            }
        // null이 발생하면 UI 에 해당 사용자가 없음을 출력
        return result;
    }


    public void check(Integer voter) throws Exception {
    }
}
