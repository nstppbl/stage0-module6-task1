package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String brown, int i, boolean b) {
        color = "brown";
        numberOfPaws = 4;
        hasFur = true;
    }

    public String getDescription() {
        if (hasFur) {
            return "This animal is mostly " + this.color + "." + " It has " + this.numberOfPaws + " paws and a fur.";
        } else {
            return "This animal is mostly " + this.color + "." + " It has " + this.numberOfPaws + " paws and no fur.";
        }
    }
}
