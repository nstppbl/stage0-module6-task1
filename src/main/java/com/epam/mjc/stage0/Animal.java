package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = "brown";
        this.numberOfPaws = 4;
        this.hasFur = true;
    }

    public String getDescription() {
        if (this.hasFur) {
            return "This animal is mostly " + this.color + "." + " It has " + this.numberOfPaws + " paws and a fur.";
        } else {
            return "This animal is mostly " + this.color + "." + " It has " + this.numberOfPaws + " paws and no fur.";
        }
    }
}
