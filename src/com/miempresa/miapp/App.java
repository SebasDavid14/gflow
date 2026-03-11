package com.miempresa.miapp;

public class App {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("Suma: " + sumar(5,3));
        System.out.println("Potencia: " + OperacionAvanzada.potencia(2,3));
        System.out.println("Raiz: " + OperacionAvanzada.raizCuadrada(16));
        System.out.println("Modulo: " + OperacionAvanzada.modulo(10,3));

    }
}