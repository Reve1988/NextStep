package com.next.step.first.exam;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by giwoong.Kim on 2016. 10. 10..
 */
public class StringCalculatorTest {
    private StringCalculator calculator;

    @Before
    public void setup() {
        calculator = new StringCalculator();
    }

    @Test
    public void testAdd_default_delimitor_string_null() {
        // given
        String str = null;

        // when
        int result = calculator.add(str);

        // then
        assertThat(result, is(0));
    }

    @Test
    public void testAdd_default_delimitor_string_empty() {
        // given
        String str = "";

        // when
        int result = calculator.add(str);

        // then
        assertThat(result, is(0));
    }

    @Test
    public void testAdd_default_delimitor_string_blank() {
        // given
        String str = "";

        // when
        int result = calculator.add(str);

        // then
        assertThat(result, is(0));
    }

    @Test
    public void testAdd_default_delimitor_string_2() {
        // given
        String str = "2";

        // when
        int result = calculator.add(str);

        // then
        assertThat(result, is(2));
    }

    @Test
    public void testAdd_default_delimitor_string_2_3() {
        // given
        String str = "2,3";

        // when
        int result = calculator.add(str);

        // then
        assertThat(result, is(5));
    }

    @Test
    public void testAdd_default_delimitor_string_2_3_() {
        // given
        String str = "2:3";

        // when
        int result = calculator.add(str);

        // then
        assertThat(result, is(5));
    }

    @Test
    public void testAdd_custom_delimitor_string_2_3_() {
        // given
        String str = "//;\n2;3";

        // when
        int result = calculator.add(str);

        // then
        assertThat(result, is(5));
    }
}