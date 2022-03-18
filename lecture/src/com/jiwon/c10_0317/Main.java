package com.jiwon.c10_0317;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        
        // 파일 경로
        String path = "https://caching.lottecinema.co.kr//Media/MovieFile/MovieImg/202203/18516_105_8.jpg";
        //inputStream 얻어 오기
        InputStream input = new URL(path).openStream();
        
        //outputStream 으로 쓰기
        OutputStream outputStream = new FileOutputStream("C:\\zzz\\movie.jpg");

       while (true){
           // inputstream으로 읽는다. (1byte 씩 파일을 읽는다.)
           int data = input.read();
           // 다읽으면 -1을반환
           if(data == -1)
               break;
           outputStream.write(data);
       }
    }
}
