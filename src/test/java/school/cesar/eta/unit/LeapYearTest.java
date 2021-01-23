package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void isLeapYear_divisibleBy4_true(){
        boolean actual = LeapYear.isLeapYear(4);
        Assertions.assertTrue(actual);
    }

    @Test
    public void isLeapYear_nonDivisibleBy4_false(){
        boolean actual = LeapYear.isLeapYear(3);
        Assertions.assertFalse(actual);
    }

    @Test
    public void isLeapYear_divisibleBy100_false(){
        boolean actual = LeapYear.isLeapYear(100);
        Assertions.assertFalse(actual);
    }

    @Test
    public void isLeapYear_divisibleBy400_true(){
        boolean actual = LeapYear.isLeapYear(400);
        Assertions.assertTrue(actual);
    }
}
