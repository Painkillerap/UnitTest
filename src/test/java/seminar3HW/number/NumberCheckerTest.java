package seminar3HW.number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {
    private NumberChecker checker;

    @BeforeEach
    void setUp() {
        checker=new NumberChecker();
    }

    //проверяем, является ли переданное число четным или нечетным:
    @Test
    void evenOddNumber() {
        assertTrue(checker.evenOddNumber(4));
        assertFalse(checker.evenOddNumber(7));

    }

    //Второй вариант теста к методу evenOddNumber
    @ParameterizedTest
    @CsvSource({
            "2, true",
            "4, true",
            "6, true",
            "8, true",
            "10, true",
            "1, false",
            "3, false",
            "5, false",
            "7, false",
            "9, false"
    })
    public void testEvenOddNumber(int number, boolean expected) {
        assertEquals(expected, checker.evenOddNumber(number));
    }

    //проверяем, попадает ли переданное число в интервал (25;100)
    @Test
    void numberInIntervalTest() {
        int num = 30;
        assertTrue(checker.numberInInterval(30));
        assertFalse(checker.numberInInterval(15));
    }

    //Второй вариант теста к методу numberInInterval
    @ParameterizedTest
    @CsvSource({
            "10, false",
            "25, true",
            "50, true",
            "75, true",
            "99, true",
            "-1, false",
            "0, false",
            "26, true",
            "100, true",
            "101, false"
    })
    public void testNumberInInterval(int number, boolean expected) {
        assertEquals(expected, checker.numberInInterval(number));
    }
}