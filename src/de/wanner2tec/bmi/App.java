package de.wanner2tec.bmi;

import de.wanner2tec.bmi.controller.BMI;
import de.wanner2tec.bmi.controller.BMICalc;
import de.wanner2tec.bmi.controller.BMICalcFabric;
import de.wanner2tec.bmi.model.Animal;
import de.wanner2tec.bmi.model.Dog;
import de.wanner2tec.bmi.model.Fish;

import java.util.Scanner;

public class App {
    private Scanner scanner = new Scanner(System.in);
    private Animal animal;
    private String[] results = new String[BMI.MAX_AMOUNT];
    private int index = -1;

    public static void main(String[] args) {
        new App();
    }

    private App() {
        while (index < BMI.MAX_AMOUNT) {
            System.out.print("BMI [1=Select Animal 2=Eat 3=Play 4=Calc] > ");
            int selection = scanner.nextInt();
            if (selection == 1) {
                input();
            } else if (selection == 2) {
                animal.eat();
            } else if (selection == 3) {
                animal.play();
            } else if (selection == 4) {
                process();
                output();
            }
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
            System.out.println("BMI [Falsch Eingabe!]");
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
        BMICalc bmiCalc = BMICalcFabric.createInstance();
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
