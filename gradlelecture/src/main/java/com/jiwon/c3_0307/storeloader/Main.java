package com.jiwon.c3_0307.storeloader;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        StoreLoader storeLoader = new StoreLoader();
        StoreDTO[] stores = storeLoader.getStores();

        for(StoreDTO s : stores )
            System.out.println(s);
    }
}
