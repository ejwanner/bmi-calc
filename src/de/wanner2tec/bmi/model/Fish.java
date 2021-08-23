package de.wanner2tec.bmi.model;

public class Fish extends Animal{
    public Fish() {
        super();
        System.out.println("Ein neuer Fisch wurde erstellt!");
    }

    public Fish(String name, double weight, double height) {
        super();
        super.setName(name);
        super.setWeight(weight);
        super.setHeight(height);
    }

    public void eat() {
        super.weight += 0.001;
    }

    public void eat(double amount) {
        super.weight += amount;
    }
}

