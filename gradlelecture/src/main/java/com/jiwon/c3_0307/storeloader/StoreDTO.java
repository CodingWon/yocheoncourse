package com.jiwon.c3_0307.storeloader;


public class StoreDTO {
    int sno;
    String name;
    double lat,lng;

    public StoreDTO(int sno, String name, double lat, double lng){
        this.sno = sno;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "StoreDTO{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
