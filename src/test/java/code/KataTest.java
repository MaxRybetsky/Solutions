package code;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void basicTest() {
        assertEquals("apple", Kata.subtractSum(10));
    }

    @Test
    public void whenSumDigitsOf325() {
        assertThat(
                Kata.digitsSum(324),
                is(9)
        );
    }

    @Test
    public void whenCalcNumberOf109() {
        assertThat(
                Kata.numberCalc(109),
                is(99)
        );
    }

    @Test
    public void whenCalcNumberOf110() {
        assertThat(
                Kata.numberCalc(109),
                is(99)
        );
    }

    @Test
    public void whenCalcNumberOf10() {
        assertThat(
                Kata.numberCalc(10),
                is(9)
        );
    }
}