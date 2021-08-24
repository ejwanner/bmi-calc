package de.wanner2tec.bmi;

import de.wanner2tec.bmi.controller.BMICalc;
import de.wanner2tec.bmi.model.Animal;
import de.wanner2tec.bmi.model.Dog;
import de.wanner2tec.bmi.model.Fish;

import java.util.Scanner;

public class App {
    private Scanner scanner = new Scanner(System.in);
    private Animal animal;
    private String[] results = new String[BMICalc.MAX_AMOUNT];
    private int index = -1;

    public static void main(String[] args) {
        new App();
    }

    private App() {
        while (index < BMICalc.MAX_AMOUNT) {
            input();
            process();
            output();
        }
        scanner.close();
    }

    private void input() {
        System.out.print("BMI [1=Dog 2=Fish] > ");
        int animalTyp = scanner.nextInt();

        if (animalTyp == 1) {
            animal = new Dog();
        } else if (animalTyp == 2){
            animal = new Fish();
        } else {
            System.out.println("BMI [Falsche Eingabe!]");
        }

        if (animal instanceof Dog) {
            System.out.println("BMI [Dog]");
        } else if (animal instanceof Fish) {
            System.out.println("BMI [Fish]");
        }

        System.out.print("BMI [Geben Sie den Namen ein] > ");
        String name = scanner.next();
        animal.setName(name);

        System.out.print("BMI [Geben Sie ein Gewicht ein] > ");
        double weight = scanner.nextDouble();
        animal.setHeight(weight);

        System.out.print("BMI [Geben Sie die Größe ein] > ");
        double height = scanner.nextDouble();
        animal.setWeight(height);
    }

    private void process() {
        BMICalc bmiCalc = new BMICalc();
        results[++index] = bmiCalc.check(animal);
    }

    private void output() {
        int i = -1;
        for (String result : results) {
            if (++i > index) {
                break;
            }
            System.out.println("BMI [result= " + result + "]");
        }
    }
}
