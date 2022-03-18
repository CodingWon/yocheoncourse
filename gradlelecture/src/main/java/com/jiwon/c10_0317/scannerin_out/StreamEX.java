package com.jiwon.c10_0317.scannerin_out;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StreamEX {
    public static void main(String[] args) throws IOException {
        // input
        Scanner sc = new Scanner(System.in);
        // output - file
        OutputStream out = new FileOutputStream("C:\\zzz\\test1.txt");

        while (true){
            System.out.println("입력하세요");
            String str = sc.nextLine();

            if(str.equals("exit"))
                break;


            byte[] bytes = (str+"\n").getBytes(StandardCharsets.UTF_8);
            out.write(bytes);
        }
    }
}
