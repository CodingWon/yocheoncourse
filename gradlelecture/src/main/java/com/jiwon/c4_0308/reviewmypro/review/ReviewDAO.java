package com.jiwon.c4_0308.reviewmypro.review;

import java.util.ArrayList;

public class ReviewDAO {
    ArrayList<ReviewVO> reviews;

    public ReviewDAO(){
        reviews = new ArrayList<ReviewVO>();
    }

    public void add(ReviewVO reviewVO){
        reviews.add(reviewVO);
    }

    public ArrayList<ReviewVO> getReviews(){
        return this.reviews;
    }
}
