package com.jiwon.c4_0308.reviewmypro.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class StoreVO {
    private int sno;
    private String name;
    private double lat;
    private double lng;
}
