package com.jiwon.c11_0318.server.ui;

import com.jiwon.c11_0318.server.service.FoodService;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FoodWebServer {

    private FoodService foodService;

    public FoodWebServer(FoodService foodService){
        this.foodService = foodService;
    }

    public void doRun() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("server ready ......");

        for(int i = 0; i<100; i++){
            Socket client = serverSocket.accept();
            System.out.println(client);
            OutputStream out = client.getOutputStream();
            List<String> foodList = foodService.recommand();
            String msg = String.join(",",foodList)+"\n";
            out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());
            out.write(new String("Cache-Control: private\r\n").getBytes());
            out.write(new String("Content-Length: "+msg.getBytes("UTF-8").length+"\r\n").getBytes());
            out.write(new String("Content-Type: text/html; chars et=UTF-8\r\n\r\n").getBytes());
            out.write(msg.getBytes(StandardCharsets.UTF_8));
            System.out.println("hello");
        }
    }
}
