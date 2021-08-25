package de.wanner2tec.bmi.model;

public class Dog extends Animal {

    public void eat() {
        super.setWeight(super.getWeight() + 0.1);
    }

    public void play() {
        super.setWeight(super.getWeight() - 0.1);
    }
}

