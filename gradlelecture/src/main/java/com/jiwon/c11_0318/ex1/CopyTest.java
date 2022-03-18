package com.jiwon.c11_0318.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest {
    //bad
    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis(); // 1970-01-01 유닉스 타임
        InputStream in = new FileInputStream("C:\\zzz\\aaa.jpg");
        System.out.println(in);
        OutputStream out = new FileOutputStream("C:\\zzz\\copy.jpg");

        byte[] buffer = new byte[100];

        while (true){
            int count = in.read(buffer);

            if(count == -1)
                break;

            out.write(buffer);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
