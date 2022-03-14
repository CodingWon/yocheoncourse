package com.jiwon.c4_0308.reviewmypro.store;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StoreService {
    StoreDAO storeDAO;

    public StoreVO[] getStoreDAO(){
        StoreVO[] stores = storeDAO.getStores();

        return stores;
    }
}
