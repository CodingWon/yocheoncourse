package com.jiwon.c4_0308.game;

public class MonsterFactory {


    public Monster makeSlim(){
        Monster monster =
                new Monster("슬라임",10,new int[]{10,20} );


        return monster;
    }
}
