package de.wanner2tec.bmi.controller;


public interface BMICalc extends BMI {
    public BMIResult check(BMIBody bmiBody);
}
