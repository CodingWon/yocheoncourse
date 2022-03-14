package com.jiwon.c4_0308.reivewpro.store;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        StoreLoader loader = new StoreLoader();

        StoreDTO[] dtos = loader.getStores();

        for (StoreDTO dto:dtos) {
            System.out.println(dto);
        }//end for
    }
}
