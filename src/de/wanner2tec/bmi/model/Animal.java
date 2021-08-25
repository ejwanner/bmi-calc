package de.wanner2tec.bmi.model;

import de.wanner2tec.bmi.controller.BMIBody;

public abstract class Animal implements BMIBody {
    private String name;
    private double weight;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract void eat();
    public abstract void play();
}
