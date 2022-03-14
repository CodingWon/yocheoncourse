package com.jiwon.c1_0303;

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
