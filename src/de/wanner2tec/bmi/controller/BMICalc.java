package de.wanner2tec.bmi.controller;


public interface BMICalc extends BMI {

    public default String check(BMIBody bmiBody) {
        double bmi = bmiBody.getWeight() / (bmiBody.getHeight() * bmiBody.getHeight());
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
