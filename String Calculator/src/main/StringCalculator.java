package main;

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
        String[] numberArray = numbers.split(",");
        int sum = 0;
        for (String number : numberArray) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
