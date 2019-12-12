package com.company;

public class Character {
    public int health;
    public int hunger;
    public int karma;
    public String name;

    public Character(String name) {
        karma = 1;
        health = 100;
        hunger = 50;
        this.name = name;
    }
}

