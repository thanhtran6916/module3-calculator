package model;

public class Calculator {
    private double numberA;
    private double numberB;

    public Calculator(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double sum() {
        return numberA + numberB;
    }

    public double subtraction() {
        return numberA - numberB;
    }

    public double multiplication() {
        return numberA * numberB;
    }

    public double division() {
        if (numberB == 0) {
            throw new NumberFormatException();
        }
        return numberA / numberB;
    }
}

