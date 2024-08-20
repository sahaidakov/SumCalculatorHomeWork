package org.example.sumcalculator;

public class CalculatorMain {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        try {
            System.out.println(sumCalculator.sum(3));
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument error");
        }

    }
}
