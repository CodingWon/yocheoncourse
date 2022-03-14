package com.jiwon.c4_0308.reviewmypro.review;

import lombok.*;

@AllArgsConstructor
@ToString
@Setter
@Getter
@Builder
public class ReviewVO {
    private int rno;
    private int sno;
    private int score;
}
