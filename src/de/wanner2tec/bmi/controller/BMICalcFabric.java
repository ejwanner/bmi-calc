package de.wanner2tec.bmi.controller;

public class BMICalcFabric {
    public static BMICalc createInstance() {
        return new BMICalcImpl();
    }
}
