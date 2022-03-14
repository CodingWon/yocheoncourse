package com.jiwon.c4_0308.reivewpro.review;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class ReviewDTO {

    private int rno;
    private int sno;
    private int score;


}
