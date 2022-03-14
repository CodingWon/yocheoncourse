package com.jiwon.c4_0308.reivewpro.review;

import com.jiwon.c4_0308.reivewpro.store.StoreLoader;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReviewMain {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        ReviewService service = new ReviewService();
        StoreLoader storeLoader = new StoreLoader();
        ReviewUI reviewUI = new ReviewUI(scanner,service,storeLoader);

        reviewUI.play();

//        ReviewDTO reviewDTO =
//                ReviewDTO.builder()
//                        .sno(3)
//                        .score(5)
//                        .build();
//
//        System.out.println(reviewDTO);

    }

}
