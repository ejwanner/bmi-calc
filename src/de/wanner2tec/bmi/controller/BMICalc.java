package de.wanner2tec.bmi.controller;

import de.wanner2tec.bmi.model.Dog;

public class BMICalc {
    public double calc(Dog myDog) {
        double bmi = myDog.getWeight() / (myDog.getHeight() * myDog.getHeight());
        return bmi;
    }
}
