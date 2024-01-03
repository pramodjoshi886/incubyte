package main;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    /**
     * method that takes string numbers as input and returns sum integer value
     * @param numbers
     * @return
     */
    public static int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        //default delimiters
        String[] delimiters = { ",", "\n" };

        // Check if a custom delimiter is specified
        if (numbers.startsWith("//")) {
            String customDelimiter = numbers.substring(2, 3);
            delimiters = new String[] { customDelimiter };
            numbers = numbers.substring(4);
        }

        // Split the input string using the delimiters
        String[] numberArray = numbers.split(String.join("|", delimiters));

        List<Integer> negatives = new ArrayList<>();

        int sum = 0;
        for (String number : numberArray) {
            int num = Integer.parseInt(number);
            if (num < 0) {
                negatives.add(num);
            } else if(num<=1000){
                sum += num;
            }
        }

        // Throw exception for negative numbers, if any
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers are not allowed: " + negatives);
        }

        return sum;
    }
}
