package com.idat.ec_uno.model;

public class Calculadora {

    int n1;
    int n2;

    public Calculadora() {
    }

    public Calculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
