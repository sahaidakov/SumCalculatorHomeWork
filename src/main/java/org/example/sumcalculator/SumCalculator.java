package org.example.sumcalculator;

public class SumCalculator {
    int sum(int n) {

        int summary = 0;

        if (n <= 0 || n >= 65536) {
            System.out.println("Input should be between 0 and 65536");
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <= n; i++) {
            summary = i + summary;
        }
        return summary;
    }
}
