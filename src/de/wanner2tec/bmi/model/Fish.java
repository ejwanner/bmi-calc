package de.wanner2tec.bmi.model;

public class Fish extends Animal{

    public void eat() {
        super.setWeight(super.getWeight() + 0.001);
    }

    public void play() {
        super.setWeight(super.getWeight() - 0.001);
    }
}

