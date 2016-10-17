package com.next.step.first.exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by giwoong.Kim on 2016. 10. 10..
 */
public class StringCalculator {
    public static final String DEFAULT_DELIMITER = ",|:";

    public int add(String text) {
        if (isBlank(text)) {
            return 0;
        }

        return sum(toInts(split(text)));
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private String[] split(String text) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            String customDelimeter = matcher.group(1);
            return matcher.group(2).split(customDelimeter);
        }

        return text.split(DEFAULT_DELIMITER);
    }

    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            numbers[i] = toPositive(values[i]);
        }

        return numbers;
    }

    private int toPositive(String value) {
        int number = Integer.parseInt(value);

        if (number < 0) {
            throw new RuntimeException();
        }

        return number;
    }

    private int sum(int[] values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return sum;
    }
}
