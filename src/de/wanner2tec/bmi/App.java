package de.wanner2tec.bmi;

import de.wanner2tec.bmi.controller.BMI;
import de.wanner2tec.bmi.controller.BMIBody;
import de.wanner2tec.bmi.controller.BMICalc;
import de.wanner2tec.bmi.controller.BMIResult;
import de.wanner2tec.bmi.model.Dog;
import de.wanner2tec.bmi.model.DogException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private Scanner scanner = new Scanner(System.in);
    private Dog dog = new Dog();
    private BMIResult[] results = new BMIResult[BMI.MAX_AMOUNT];
    private int index = -1;

    public static void main(String[] args) {
        new App(args);
    }

    private App(String[] param) {
        if (param.length == 2) {
            dog = new Dog(param[0], param[1]);
        } else {
            dog = new Dog();
            System.out.print("BMI [Geben Sie den Namen ein] > ");
            String name = scanner.next();
            dog.setName(name);

            System.out.print("BMI [Geben Sie die Größe ein] > ");
            double height = scanner.nextDouble();
            try {
                dog.setWeight(height);
            } catch (DogException e) {
                e.printStackTrace();
            }
        }


        while (index < BMI.MAX_AMOUNT) {
            System.out.print("BMI [Select Calc End] > ");
            String selection = scanner.next().toLowerCase().intern();
            switch (selection) {
                case "select":
                    input();
                    break;
                case "calc":
                    output();
                    break;
                case "end":
                    System.out.println("Ende Gelände");
                    break;
                default:
                    System.out.println("BMI [Falsche Eingabe!]");
            }
        }
        scanner.close();
    }

    private void input() {
        System.out.print("BMI [Geben Sie ein Gewicht ein] > ");
        try {
            double weight = scanner.nextDouble();
            dog.setHeight(weight);
        } catch (InputMismatchException e) {
            System.out.println("BMI [Falsche Eingabe!]");
            return;
        } finally {
            scanner = new Scanner(System.in);
        }

        BMICalc bmiCalc = new BMICalc() {
            public BMIResult check(BMIBody bmiBody) {
                double bmi = bmiBody.getWeight() / (bmiBody.getHeight() * bmiBody.getHeight());
                BMIResult result = null;
                if (bmi >= BMI_MAX) {
                    result = BMIResult.ÜBERGEWICHT;
                } else if (bmi <= BMI_MIN) {
                    result = BMIResult.UNTERGEWICHT;
                } else {
                    result = BMIResult.NORMAL;
                }
                return result;
            }
        };
        results[++index] = bmiCalc.check(dog);
    }

    private void output() {
        System.out.println(dog);
        int i = -1;
        for (BMIResult result : results) {
            if (++i > index) {
                break;
            }
            System.out.println("BMI [result= " + result + "]");
        }
    }
}
