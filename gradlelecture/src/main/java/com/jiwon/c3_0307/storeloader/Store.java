package com.jiwon.c3_0307.storeloader;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Store {
    long sno;
    String name;
    double lat, lng;

    public Store(String name, double lat, double lng){
        this.name = name;
        this.lat = lat;
        this.lng = lng;
    }
}
