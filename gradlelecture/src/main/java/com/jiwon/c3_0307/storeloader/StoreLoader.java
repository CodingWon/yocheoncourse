package com.jiwon.c3_0307.storeloader;

//Main 에서 생성이 되면 로드한다. => 생성자 이용해서 값 세팅

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoreLoader {
    StoreDTO[] stores;

    public StoreLoader() throws FileNotFoundException {
        File path = new File("C:\\Users\\JIwon\\IdeaProjects\\yocheoncourse\\gradlelecture\\src\\main\\java\\com\\jiwon\\c3_0307\\storeloader\\data\\store.txt");
        Scanner sc = new Scanner(path);
        stores = new StoreDTO[5];

        for(int i =0; i<stores.length; i++){
            String line = sc.nextLine();
            String [] arr = line.split(",");

            int sno = Integer.parseInt(arr[0]);
            String name = arr[1];
            double lat = Double.parseDouble(arr[2]);
            double lng = Double.parseDouble(arr[3]);

            StoreDTO storeDTO = new StoreDTO(sno,name,lat,lng);
            stores[i] = storeDTO;
        }
    }

    public StoreDTO[] getStores(){
        return this.stores;
    }

}
