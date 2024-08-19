package org.example.sumcalculator;

public class SumCalculator {
    int sum(int n) {
        int summary = 0;

        if (n == 0) {
            System.out.println("can't input 0");
            return 0;
        } else if (n < 0) {
            n = n * (-1);
            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = n - i;
            }
            for (int number : numbers) {
                summary = number + summary;
            }
            summary = summary * (-1);
        } else if (n > 0) {
            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = n - i;
            }
            for (int number : numbers) {
                summary = number + summary;
            }
        } else {
            System.out.println("input error");
        }
        return summary;
    }
}
