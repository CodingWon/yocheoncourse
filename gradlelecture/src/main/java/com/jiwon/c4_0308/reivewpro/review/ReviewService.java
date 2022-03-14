package com.jiwon.c4_0308.reivewpro.review;

import java.util.Arrays;

public class ReviewService {

    private ReviewDTO[] arr;
    private int idx;

    public ReviewService(){
        this.arr = new ReviewDTO[10];
        this.idx = 0;
    }

    public int add(ReviewDTO reviewDTO){

        int index = idx;
        reviewDTO.setRno(index +1);
        System.out.println("ReviewService...add: " + reviewDTO);

        this.arr[idx++] = reviewDTO;

        System.out.println(Arrays.toString(arr));

        return reviewDTO.getRno();
    }

    public ReviewDTO[] sortByScore(){
        Arrays.sort(arr, (a,b) -> {
            if(a == null || b == null){
                return 0;
            }
            return b.getScore() - a.getScore();
        });
        return arr;
    }

}
