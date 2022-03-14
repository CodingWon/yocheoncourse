package com.jiwon.c2_0304.Box;

// 1. box에 꽝과 당첨을 섞는다.
// 2. 하나씩 뽑는다.

import java.util.Arrays;

public class Box {

    String notes[];
    int current;

    public Box(int num){
        notes = new String[num];
        current=0;
        int r = (int)(Math.random()*num);
        for(int i = 0; i<num; i++){
            notes[i] = "꽝";
            if(i == r)
                notes[i] = "당첨";
        }
        System.out.println(Arrays.toString(notes));
    }

    public String getNote(){
        String result = "";

        result = notes[current];

        current ++;
        return result;
    }
}
