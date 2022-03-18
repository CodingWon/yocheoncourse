package com.jiwon.c10_0317;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TestServer {
    //bad
    public static void main(String[] args) throws Exception {

        System.out.println("start server ............");
        ServerSocket soverSocket = new ServerSocket(5555);
        System.out.println("server run...................");

        for(int i = 0; i<10; i++){
            System.out.println("wait client");
            Socket socket = soverSocket.accept();
            System.out.println(socket);

            OutputStream out =socket.getOutputStream();
            String str = "한식";
            byte[] arr = str.getBytes(StandardCharsets.UTF_8);
            out.write(arr);

        }//end


    }
}
