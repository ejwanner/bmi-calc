package de.wanner2tec.bmi;

import de.wanner2tec.bmi.controller.BMICalc;
import de.wanner2tec.bmi.model.Animal;
import de.wanner2tec.bmi.model.Dog;
import de.wanner2tec.bmi.model.Fish;

public class App {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];

        animal[0] = new Dog("Henry", 0.45, 8.9);
        animal[0].eat();
        animal[0].eat();
        animal[0].eat();

        animal[1] = new Dog("Murmel", 0.22, 4.8);
        animal[1].eat();
        animal[1].eat();
        ((Dog)animal[1]).play();
        ((Dog)animal[1]).play();

        System.out.println(animal[0].getName());
        System.out.println(animal[0].getWeight());
        System.out.println(animal[0].getHeight());
        System.out.println(animal[1].getName());

        animal[2] = new Fish("Peter", 0.1, 0.005);
        animal[2].eat();
        animal[2].eat();
        System.out.println(animal[2].getName());
        System.out.println(animal[2].getWeight());
        System.out.println(animal[2].getHeight());

        double bmi0 = BMICalc.calc(animal[0]);
        System.out.println(bmi0);
        System.out.println(
                bmi0 >= BMICalc.BMI_MAX ? "Übergewichtig" :
                        (bmi0 <= BMICalc.BMI_MIN ? "Untergewichtig" :
                            "Normalgewichtig"
                        )
        );
        double bmi1 = BMICalc.calc(animal[1]);
        System.out.println(bmi1);
        double bmi2 = BMICalc.calc(animal[2]);
        System.out.println(bmi2);

        System.out.println("Amount of calculations " + BMICalc.counter);

    }
}
