package org.example.sumcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setSumCalculator() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void SumCalculatorSuccessTest() {

        // Given
        int input = 3;
        int expected = 6;

        // When
        int result = sumCalculator.sum(input);

        //Then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void SumCalculatorSuccessTest2() {

        // Given
        int input2 = 1;
        int expected2 = 1;

        // When
        int result2 = sumCalculator.sum(input2);

        //Then
        Assertions.assertEquals(expected2, result2);

    }

    @Test
    void SumCalculatorSuccessTest3() {

        // Given
        int input3 = 0;

        // Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(input3));
    }
}
