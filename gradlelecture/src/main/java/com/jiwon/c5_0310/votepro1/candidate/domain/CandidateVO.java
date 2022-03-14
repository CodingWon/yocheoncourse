package com.jiwon.c5_0310.votepro1.candidate.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class CandidateVO {
    private Integer cno;
    private String name;
    private String party;
}
