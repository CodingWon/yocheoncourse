package com.jiwon.c4_0308.reviewmypro.store;

public class StoreDAO {

    private StoreVO[] stores;

    public StoreDAO(){
        stores = new StoreVO[5];
        stores[0] = new StoreVO(1,"우레옥",32.4,522.3);
        stores[1] = new StoreVO(2,"버거킹",132.4,52.3);
        stores[2] = new StoreVO(3,"채선당",332.4,52.3);
        stores[3] = new StoreVO(4,"먹쉬돈나",322.4,52.3);
        stores[4] = new StoreVO(5,"안동장",352.4,52.3);
    }

    public StoreVO[] getStores(){
        return stores.clone();
    }
}
