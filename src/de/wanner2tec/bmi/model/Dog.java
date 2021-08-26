package de.wanner2tec.bmi.model;

import de.wanner2tec.bmi.controller.BMIBody;

public class Dog implements BMIBody {
    private String name;
    private Double weight;
    private Double height;

    public Dog(String... varargs) {
        if (varargs.length >= 1) {
            this.name = varargs[0];
            if (varargs.length >= 2) {
                this.height = Double.parseDouble(varargs[1]);
                if (varargs.length >= 3) {
                    this.weight = Double.parseDouble(varargs[2]);
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) throws DogException {
        if (weight.doubleValue() <= 0) {
            throw new DogException("Der Hund muss größer als 0.0 Meter sein");
        }
        this.weight = weight;
    }

    @Override
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

}
