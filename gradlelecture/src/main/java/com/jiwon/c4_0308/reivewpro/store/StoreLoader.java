package com.jiwon.c4_0308.reivewpro.store;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoreLoader {

    private StoreDTO[] stores;

    public StoreLoader() throws FileNotFoundException {

        stores = new StoreDTO[5];

        File storeFile = new File("C:\\zzz\\store.txt");
        Scanner scanner = new Scanner(storeFile);

        for(int i = 0;i < stores.length; i++){

            String line = scanner.nextLine();
            String[] arr = line.split(",");
            int sno = Integer.parseInt(arr[0]);
            String name = arr[1];
            double lat = Double.parseDouble(arr[2]);
            double lng = Double.parseDouble(arr[3]);

            StoreDTO storeDTO = new StoreDTO(sno,name,lat,lng);

            stores[i] = storeDTO;
        }//end for

//        stores[0] = new StoreDTO(1,"우래옥",37.111,127.111);
//        stores[1] = new StoreDTO(2,"AAA",37.111,127.111);
//        stores[2] = new StoreDTO(3,"BBB",37.111,127.111);
//        stores[3] = new StoreDTO(4,"CCC",37.111,127.111);
//        stores[4] = new StoreDTO(5,"DDD",37.111,127.111);
    }


    public StoreDTO[] getStores(){

        return this.stores;
    }
}
