package com.jiwon.c4_0308.game;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Monster {

    private String name;
    private int hp;
    private int[] weapon;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int[] getWeapon() {
        return weapon.clone();
    }

    public void setWeapon(int[] weapon) {
        this.weapon = weapon;
    }
}
