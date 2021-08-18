package de.wanner2tec.bmi;

import de.wanner2tec.bmi.controller.BMICalc;
import de.wanner2tec.bmi.model.Dog;

public class App {
    public static void main(String[] args) {
        Dog[] dog = new Dog[2];
        dog[0] = new Dog();
        dog[1] = new Dog();
        dog[0].setName("Henry");
        dog[0].setHeight(0.45);
        dog[0].setWeight(8.9);

        dog[1].setName("Murmel");
        System.out.println(dog[0].getName());
        System.out.println(dog[0].getWeight());
        System.out.println(dog[0].getHeight());
        System.out.println(dog[1].getName());

        BMICalc bmiCalc = new BMICalc();
        double result = bmiCalc.calc(dog[0]);
        System.out.println(result);
    }
}
