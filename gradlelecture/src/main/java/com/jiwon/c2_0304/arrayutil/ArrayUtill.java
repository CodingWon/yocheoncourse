package com.jiwon.c2_0304.arrayutil;

public class ArrayUtill {

    /*result 를 -1로 초기화 해주고 참일 때만 result 에 값을 담는다. 마지막에 리턴*/
    public static int findIndex(String[] arr, String keyword){
        // result 를 -1로 초기화 한다.
        int result = -1;
        for(int i = 0; i< arr.length; i++){
            // 배열 안에 문자열과 keyword와 일치하면 index를 저장한다.
            if(arr[i].equals(keyword)){
                result = i;
                break;
            }
        }
        //
        return result;
    }

    /*참일 때 인덱스를 리턴 , 아니면 -1을 리턴*/
    public static int findIndex1(String[] arr, String keyword){

        for(int i = 0; i< arr.length; i++){
            // 배열 안에 문자열과 keyword와 일치하면 index를 저장한다.
            if(arr[i].equals(keyword)){
                return i;
            }
        }
        //
        return -1;
    }

}
