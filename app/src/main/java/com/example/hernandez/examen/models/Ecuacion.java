package com.example.hernandez.examen.models;

public class Ecuacion {

    private double x1;
    private double x2;

    public void resolverEcuacion (double a, double b, double c) {
        double result = Math.pow(b,2) - (4*a*c);

        this.x1 = (-b + Math.sqrt(result)) / 2*a;
        this.x2 = (-b - Math.sqrt(result)) / 2*a;
    }

    public double getX1() {
        return x1;
    }


    public double getX2() {
        return x2;
    }


}
