package de.wanner2tec.bmi;

import de.wanner2tec.bmi.controller.BMI;
import de.wanner2tec.bmi.controller.BMIBody;
import de.wanner2tec.bmi.controller.BMICalc;
import de.wanner2tec.bmi.model.Dog;

import java.util.Locale;
import java.util.Scanner;

public class App {
    private Scanner scanner = new Scanner(System.in);
    private Dog dog = new Dog();
    private String[] results = new String[BMI.MAX_AMOUNT];
    private int index = -1;

    public static void main(String[] args) {
        new App();
    }

    private App() {
        System.out.print("BMI [Geben Sie den Namen ein] > ");
        String name = scanner.next();
        dog.setName(name);

        System.out.print("BMI [Geben Sie die Größe ein] > ");
        double height = scanner.nextDouble();
        dog.setWeight(height);

        while (index < BMI.MAX_AMOUNT) {
            System.out.print("BMI [Select Calc End] > ");
            String selection = scanner.next().toLowerCase();
            if ("select".equals(selection)) {
                input();
            } else if ("calc".equals(selection)) {
                output();
            } else if ("end".equals(selection)) {
                System.out.println("Ende Gelände");
            }
        }
        scanner.close();
    }

    private void input() {
        System.out.print("BMI [Geben Sie ein Gewicht ein] > ");
        double weight = scanner.nextDouble();
        dog.setHeight(weight);

        BMICalc bmiCalc = new BMICalc() {
            public String check(BMIBody bmiBody) {
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
        };
        results[++index] = bmiCalc.check(dog);
    }

    private void output() {
        System.out.println(dog);
        int i = -1;
        for (String result : results) {
            if (++i > index) {
                break;
            }
            System.out.println("BMI [result= " + result + "]");
        }
    }
}
