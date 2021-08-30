package de.wanner2tec.bmi.controller;

public class BMIBody<E extends Number, F extends Number> {
    private E e;
    private F f;

    public F getF() {
        return f;
    }

    public void setF(F f) {
        this.f = f;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

}

