package com.next.step.first.exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by giwoong.Kim on 2016. 10. 10..
 */
public class StringCalculator {
    int add(String text) {
        if (text == null || text.trim().equals("")) {
            return 0;
        }

        String delimeter = ",|:";

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            delimeter = matcher.group(1);
            text = matcher.group(2);
        }

        String[] tokens = text.split(delimeter);
        int sum = 0;
        for (String token : tokens) {
            int number = Integer.parseInt(token);
            if (number < 0) {
                throw new RuntimeException("Number is lower than zero" + number);
            }

            sum += number;
        }

        return sum;
    }
}
