package com.jiwon.c4_0308.reviewmypro.review;

import com.jiwon.c4_0308.reivewpro.review.ReviewDTO;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@AllArgsConstructor
public class ReviewService {

    private ReviewDAO reviewDAO;
    private int idx;
    public ReviewService(ReviewDAO reviewDAO){
        this.reviewDAO = reviewDAO;
        idx = 0;

    }

    public int reviewAdd(ReviewVO reviewVO){
        reviewVO.setRno(idx++);
        reviewDAO.add(reviewVO);
        return idx;
    }

    public ArrayList<ReviewVO> getReview(){

        return reviewDAO.getReviews();
    }


}
