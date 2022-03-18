package com.jiwon.c11_0318.server;

import com.jiwon.c11_0318.server.service.FoodService;
import com.jiwon.c11_0318.server.ui.FoodServer;
import com.jiwon.c11_0318.server.ui.FoodWebServer;

public class Main {
    //bad 코드
    public static void main(String[] args) throws Exception {
        FoodService foodService = new FoodService();
        FoodWebServer foodServer = new FoodWebServer(foodService);
        foodServer.doRun();
    }
}
