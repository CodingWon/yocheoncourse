package com.jiwon.c2_0304.lotto;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] nums  = LottoNumber.getNumber();
        System.out.println(Arrays.toString(nums));
        nums = LottoNumber.getNumber2();
        System.out.println(Arrays.toString(nums));
    }
}
