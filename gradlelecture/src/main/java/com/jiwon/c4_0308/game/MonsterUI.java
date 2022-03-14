package com.jiwon.c4_0308.game;

// 몬스터를 바꿔서는 안된다.
import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public class MonsterUI {
    MonsterFactory factory;

    public void playGame(){
        Monster monster = factory.makeSlim();

        String name = monster.getName();
        int hp = monster.getHp();
        int[] weapon = monster.getWeapon();
        System.out.println(name);
        name = "마왕";
        System.out.println(name);
        hp = 10000;

        weapon[0] = 100;
        weapon[1] = 200;

        System.out.println(monster);
    }
}
