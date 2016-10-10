package com.next.step.first;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by giwoong.Kim on 2016. 10. 10..
 */
public class CalculatorTest {
    @Test
    public void add() {
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.add(6, 3));
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(6, 3));
    }
}
