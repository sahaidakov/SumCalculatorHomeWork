package org.example.sumcalculator;

public class SumCalculator {
    int sum(int n) {

        int summary = 0;

        if (n == 0 || n >= 65536) {
            System.out.println("Can't input 0 or number higher than 65535");
            throw new IllegalArgumentException();
        }

        if (n < 0) {
            n = n * (-1);
            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = n - i;
                summary = numbers[i] + summary;
            }
            summary = summary * (-1);
        } else {
            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = n - i;
                summary = numbers[i] + summary;
            }
        }
        return summary;
    }
}
