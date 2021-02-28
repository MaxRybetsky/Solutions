package code.calendarKata;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void SampleTests() {
        assertArrayEquals(new String[] {"Monday"}, Kata.mostFrequentDays(1770));
        assertArrayEquals(new String[] {"Saturday"}, Kata.mostFrequentDays(1785));
        assertArrayEquals(new String[] {"Tuesday"}, Kata.mostFrequentDays(1901));
        assertArrayEquals(new String[] {"Saturday"}, Kata.mostFrequentDays(2135));
        assertArrayEquals(new String[] {"Sunday"}, Kata.mostFrequentDays(3043));
        assertArrayEquals(new String[] {"Monday"}, Kata.mostFrequentDays(2001));
        assertArrayEquals(new String[] {"Sunday"}, Kata.mostFrequentDays(3150));
        assertArrayEquals(new String[] {"Tuesday"}, Kata.mostFrequentDays(3230));
        assertArrayEquals(new String[] {"Friday", "Saturday"}, Kata.mostFrequentDays(2016));
        assertArrayEquals(new String[] {"Wednesday"}, Kata.mostFrequentDays(1986));
        assertArrayEquals(new String[] {"Thursday"}, Kata.mostFrequentDays(3361));
        assertArrayEquals(new String[] {"Saturday"}, Kata.mostFrequentDays(1910));
        assertArrayEquals(new String[] {"Monday", "Tuesday"}, Kata.mostFrequentDays(1968));
        assertArrayEquals(new String[] {"Wednesday"}, Kata.mostFrequentDays(1794));
        assertArrayEquals(new String[] {"Monday", "Sunday"}, Kata.mostFrequentDays(1984));
        assertArrayEquals(new String[] {"Saturday", "Sunday"}, Kata.mostFrequentDays(2000));
    }
}