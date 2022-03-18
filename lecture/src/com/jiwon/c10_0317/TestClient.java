package com.jiwon.c10_0317;

import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TestClient {
    //bad code
    public static void main(String[] args) throws Exception {
        // 외부와 통신할 떄는 예외 처리
        Socket socket = new Socket("192.168.0.71",5555);
        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[100];

        int count = inputStream.read(buffer);

        System.out.println("Count : " + count);
        String str = new String(buffer, StandardCharsets.UTF_8);
        System.out.println(str);
        System.out.println("------------------------------------");
//        System.out.println((char) data);

    }
}
