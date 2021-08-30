package de.wanner2tec.bmi;

import de.wanner2tec.bmi.controller.BMIBody;
import de.wanner2tec.bmi.controller.BMICalc;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        new App();
    }

    private App() {
        BMICalc<Double, BMIBody<Double, Double>> calcer = new BMICalc<Double, BMIBody<Double, Double>>() {
            @Override
            public Double calc(BMIBody<Double, Double> v) {
                return v.getF() / (v.getE() * v.getE());
            }
        };
        BMIBody<Double, Double> body = new BMIBody<>();

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Height: ");
            body.setE(scanner.nextDouble());

            System.out.print("Weight: ");
            body.setF(scanner.nextDouble());


            System.out.printf("BMI: %.1f", calcer.calc(body));
        }
    }

    public static <U> void giveAll(U... u) {
        for(U element: u) {
            System.out.println(element);
        }
    }


}
