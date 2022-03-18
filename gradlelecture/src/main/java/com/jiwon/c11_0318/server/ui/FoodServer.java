package com.jiwon.c11_0318.server.ui;

import com.jiwon.c11_0318.server.service.FoodService;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FoodServer {

    private FoodService foodService;

    public FoodServer(FoodService foodService){
        this.foodService = foodService;
    }

    public void doRun() throws IOException {
        ServerSocket serverSocket = new ServerSocket(5555);
        System.out.println("server ready ......");

        for(int i = 0; i<100; i++){
            Socket client = serverSocket.accept();
            System.out.println(client);
            OutputStream out = client.getOutputStream();
            List<String> foodList = foodService.recommand();
            String msg = String.join(",",foodList)+"\n";
            out.write(msg.getBytes(StandardCharsets.UTF_8));
        }
    }
}
