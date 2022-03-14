package com.jiwon.c4_0308.reivewpro.review;

import com.jiwon.c4_0308.reivewpro.store.StoreDTO;
import com.jiwon.c4_0308.reivewpro.store.StoreLoader;
import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class ReviewUI {

    private Scanner scanner;
    private ReviewService reviewService;
    private StoreLoader storeLoader;

    public void play(){
        String oper = inputStr("1.리뷰등록,2.조회,3.종료");

        switch (oper){
            case "1":
                makeReview();
                break;
            case "2":
                findReview();
                break;
            case "3":
                return;
        }
        play();
    }

    private void findReview() {
        System.out.println("=============find review=============");

        ReviewDTO[] reviewDTOS = reviewService.sortByScore();

        for (ReviewDTO review:reviewDTOS) {
            if(review == null){
                continue;
            }
            System.out.println(review);
        }
    }

    private void makeReview(){
        System.out.println("-----------------------");
        StoreDTO[] stores = storeLoader.getStores();

        for (StoreDTO store:stores) {
            System.out.println(store.getSno() +":" + store.getName());
        }

        int sno = inputInt("가게 번호를 입력하세요");
        int score = inputInt("5점만점에 몇점?");

        ReviewDTO reviewDTO = ReviewDTO.builder()
                .sno(sno)
                .score(score)
                .build();

        int num = reviewService.add(reviewDTO);
        System.out.println(num+"번 리뷰가 등록되었음");

        String oper = inputStr("계속하시겠습니까?y/n");

        if(oper.equals("n")){
            return;
        }
        makeReview();
    }

    private int inputInt(String msg){

        int value = Integer.parseInt(inputStr(msg));
        return value;
    }

    private String inputStr(String msg){
        System.out.println(msg);
        String value = scanner.nextLine();
        return value;
    }
}
