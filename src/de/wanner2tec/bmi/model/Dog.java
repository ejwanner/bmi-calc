package de.wanner2tec.bmi.model;

public class Dog extends Animal {
    private Ball ball;

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

