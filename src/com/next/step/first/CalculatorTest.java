package com.next.step.first;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by giwoong.Kim on 2016. 10. 10..
 */
public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(9, calculator.add(6, 3));
    }

    @Test
    public void subtract() {
        assertEquals(3, calculator.subtract(6, 3));
    }
}
