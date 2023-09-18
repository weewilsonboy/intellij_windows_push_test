package com.codebase;

public class WaterBottle {
    private int volume = 100;
    public void drink(){
        if (volume >= 10) {
            volume -= 10;
        } else {
            System.out.println("Not enough water to drink;");
        }
    }
    public void empty(){
        volume=0;
    }
    public void fill(){
        volume = 100;
    }

    public int getVolume() {
        return volume;
    }
}
