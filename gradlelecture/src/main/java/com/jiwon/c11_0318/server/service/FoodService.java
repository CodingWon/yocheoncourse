package com.jiwon.c11_0318.server.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodService {

    private List<String> foodNames;

    public FoodService(){
        foodNames = new ArrayList<>();
        foodNames.add("파스타");
        foodNames.add("리조또");
        foodNames.add("스테이크");
        foodNames.add("스파게티");
        foodNames.add("수프");
    }

    public List<String> recommand() {
        // 섞는 기능
        Collections.shuffle(foodNames);
        // 짤라내는 기능
        return foodNames.subList(0,3);
    }

}
