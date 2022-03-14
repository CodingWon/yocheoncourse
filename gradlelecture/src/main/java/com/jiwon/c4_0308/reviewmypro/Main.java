package com.jiwon.c4_0308.reviewmypro;

import com.jiwon.c4_0308.reviewmypro.review.ReviewDAO;
import com.jiwon.c4_0308.reviewmypro.review.ReviewService;
import com.jiwon.c4_0308.reviewmypro.review.ReviewUI;
import com.jiwon.c4_0308.reviewmypro.store.StoreDAO;
import com.jiwon.c4_0308.reviewmypro.store.StoreService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StoreDAO storeDAO = new StoreDAO();
        ReviewDAO reviewDAO = new ReviewDAO();
        Scanner sc = new Scanner(System.in);
        ReviewService reviewService = new ReviewService(reviewDAO);
        StoreService storeService = new StoreService(storeDAO);
        ReviewUI reviewUI = new ReviewUI(reviewService,storeService,sc);

        reviewUI.play();
    }
}
