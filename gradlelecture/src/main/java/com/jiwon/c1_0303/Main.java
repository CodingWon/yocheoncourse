package com.jiwon.c1_0303;

public class Main {
    public static void main(String[] args) {
        Store[] stores = {
            new Store("우래옥",37,127),
            new Store("청진식당",38,127),
            new Store("원흥",37,128)
        };

//        System.out.println(Arrays.toString(stores));
        for(Store s : stores){
            System.out.println(s);
        }
    }
}
