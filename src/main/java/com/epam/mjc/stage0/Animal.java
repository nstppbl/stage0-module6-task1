package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = "someColor";
        this.numberOfPaws = 4;
        this.hasFur = true;
    }

    public String getDescription() {
        if (hasFur) {
            return "This animal is mostly " + color + "." + " It has " + numberOfPaws + " paws and a fur.";
        } else {
            return "This animal is mostly " + color + "." + " It has " + numberOfPaws + " paws and no fur.";
        }
    }
}
