package com.jiwon.c5_0310.votepro.vote.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class VoteVO {

    //객체지향적 방식 : jpa로 넘어가면 정석적인 방법
//    private VoterVO voterVO;
//    private CandidateVO candidateVO;

    //데이터베이스 위주 방식 : 식별키
    private Integer voter;
    private Integer candidate;

}