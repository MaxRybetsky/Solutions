package codewars.get_full_name;

import org.junit.Test;

import static org.junit.Assert.*;

public class DinglemouseTest {
    @Test
    public void test() {
        assertEquals("Clint Eastwood", new Dinglemouse("Clint", "Eastwood").getFullName());
    }
}