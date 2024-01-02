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
        return Integer.parseInt(numbers);
    }
}
