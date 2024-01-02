package test;

import main.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void add_EmptyString_ReturnsZero() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void add_SingleNumber_ReturnsNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void add_TwoNumbers_ReturnsSum() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void add_NewLineBetweenNumbers_ReturnsSum() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void add_CustomDelimiter_ReturnsSum() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

}
