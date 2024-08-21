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

            for (int i = 1; i <= n; i++) {
                summary = i + summary;
            }
            summary = summary * (-1);
        } else {
            for (int i = 1; i <= n; i++) {
                summary = i + summary;
            }
        }
        return summary;
    }
}
