package by.itacademy.arsenyaleksandrovich.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculator2Test {
    @Test
    public void testSum() {
        Calculator2 calculator = new Calculator2();
        double a = 1.3;
        double b = 2.3;
        double actual = calculator.sum(a, b);
        double expected = 3.6;
        Assertions.assertEquals(expected, actual, 0.1);
    }
}
