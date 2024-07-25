package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoNumbers() {
        int numberOne = 5;
        int numberTwo = 4;

        int result = calculator.addTwoNumbers(numberOne, numberTwo);

        assertEquals(9, result);
    }

    @Test
    void shouldSubtractNumbers() {
        int numberOne = 10;
        int numberTwo = 5;

        int result = calculator.subtractNumbers(numberOne, numberTwo);

        assertEquals(5, result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        int numberOne = 9;
        int numberTwo = 5;

        int result = calculator.multiplyTwoNumbers(numberOne, numberTwo);

        assertEquals(45, result);
    }

    @Test
    void shouldSumNumbers() {
        int result = calculator.sumNumbers(3, 5, 6, 3, 10, 20, 5, 1, 1);

        assertEquals(54, result);
    }

    @Test
    void shouldSumOnlyOddNumbers() {
        int result = calculator.sumOnlyOddNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertEquals(25, result);
    }

    @Test
    void shouldSumOnlyEvenNumbers() {
        int result = calculator.sumOnlyEvenNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertEquals(30, result);
    }

    @Test
    void isPrimeNumberTest1() {
        assertFalse(calculator.isPrimeNumber(4));
        assertFalse(calculator.isPrimeNumber(6));
        assertFalse(calculator.isPrimeNumber(8));
        assertFalse(calculator.isPrimeNumber(9));
        assertFalse(calculator.isPrimeNumber(10));
        assertFalse(calculator.isPrimeNumber(12));

        assertTrue(calculator.isPrimeNumber(2));
        assertTrue(calculator.isPrimeNumber(3));
        assertTrue(calculator.isPrimeNumber(5));
        assertTrue(calculator.isPrimeNumber(7));
        assertTrue(calculator.isPrimeNumber(11));
        assertTrue(calculator.isPrimeNumber(13));
        assertTrue(calculator.isPrimeNumber(17));
    }
}