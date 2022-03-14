package com.jiwon.c4_0308.reviewmypro.review;

import com.jiwon.c4_0308.reviewmypro.store.StoreDAO;
import com.jiwon.c4_0308.reviewmypro.store.StoreService;
import com.jiwon.c4_0308.reviewmypro.store.StoreVO;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Scanner;

@AllArgsConstructor
public class ReviewUI {
    private ReviewService reviewService;
    private StoreService storeService;
    private Scanner sc;

    public void play(){
        int oper = inputInt("1.리뷰등록 2.리뷰조회 3.종료");

        switch (oper){
            case 1:
                makeReview();
                break;
            case 2:
                showReview();
                break;
            case 3:
                return;
        }
        play();
    }

    private void showReview() {
        ArrayList<ReviewVO> reviews = reviewService.getReview();
        for(ReviewVO r : reviews){
            System.out.println(r);
        }
    }


    private void makeReview(){
        StoreVO[] stores = storeService.getStoreDAO();
        for(StoreVO s : stores){
            System.out.println(s.getSno() + " " +s.getName());
        }

        int sno = inputInt("가게 번호를 입력하세요");
        int score = inputInt("평점을 입력하세요");

        ReviewVO reviewVO = ReviewVO.builder()
                .sno(sno)
                .score(score)
                .build();

       int idx = reviewService.reviewAdd(reviewVO);
        System.out.println(idx + "번 리뷰가 등록 됬습니다.");

        String oper = inputStr("계속 하시겠습니까(y/n)");

        if(oper.equals("n"))
            return;

        makeReview();
    }


    public int inputInt(String msg){
        System.out.println(msg);
        int value = sc.nextInt();
        return value;
    }

    public String inputStr(String msg){
        System.out.println(msg);
        String value = sc.next();
        return value;
    }
}
