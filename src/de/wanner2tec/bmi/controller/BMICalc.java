package de.wanner2tec.bmi.controller;

import de.wanner2tec.bmi.model.Animal;

public class BMICalc {
    public static int counter;
    public static final double BMI_MAX = 25.0;
    public static final double BMI_MIN = 18.5;

    public static  double calc(Animal animal) {
        double bmi = animal.getWeight() / (animal.getHeight() * animal.getHeight());
        counter++;
        return bmi;
    }
}
