package de.wanner2tec.bmi.controller;

import de.wanner2tec.bmi.model.Animal;

public class BMICalc {
    public final static double BMI_MAX = 25.0;
    public final static double BMI_MIN = 18.5;
    public final static int MAX_AMOUNT = 100;

    public String check(Animal animal) {
        double bmi = animal.getWeight() / (animal.getHeight() * animal.getHeight());
        String result = null;
        if (bmi >= BMI_MAX) {
            result = "Übergewichtig";
        } else if (bmi <= BMI_MIN) {
            result = "Untergewichtig";
        } else {
            result = "Normal";
        }
        return result;
    }

}
