package com.jiwon.c7_0314_extends.storeex;

public class Main {

    public static void order(Store store){
        store.makeZazang();
    }

    public static void main(String[] args) {

        Store store = new Store();
        SeoulStore seoulStore = new SeoulStore();
        order(store);
        order(seoulStore);

    }
}
