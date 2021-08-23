package de.wanner2tec.bmi.model;

public class Dog extends Animal {
    private Ball ball;

    public Dog() {
        super();
        System.out.println("Der Hund wurde erstellt!");
    }

    public Dog(String name, double weight, double height) {
        super();
        System.out.println("Der Hund wurde erstellt!");
        super.setName(name);
        super.setHeight(height);
        super.setWeight(weight);
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void eat() {
        super.weight += 0.1;
    }

    public void eat(double amount) {
        super.weight += amount;
    }

    public void play() {
        super.weight -= 0.1;
    }
}

