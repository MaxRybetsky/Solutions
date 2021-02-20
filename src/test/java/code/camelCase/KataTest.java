package code.camelCase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void tests() {
        assertEquals( "Incorrect", "camel Casing", Kata.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", Kata.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", Kata.camelCase("camelcasingtest"));
    }
}
