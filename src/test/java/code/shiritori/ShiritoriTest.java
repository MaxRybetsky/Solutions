package code.shiritori;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ShiritoriTest {

    @Test
    public void test1() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat"));
        List<String> expected = new ArrayList<>(Arrays.asList("dog", "goose"
                , "elephant", "tiger", "rhino", "orc", "cat"));
        assertEquals(expected, Shiritori.theGame(words));

    }

    @Test
    public void test2() {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc"));
        List<String> expected = new ArrayList<>(Arrays.asList("dog", "goose"));
        assertEquals(expected, Shiritori.theGame(words));

    }

    @Test
    public void test3() {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("dog", "goose", "elephant", "tiger", "cat", "rhino", "rhino", "orc"));
        List<String> expected = new ArrayList<>(Arrays.asList("dog", "goose"
                , "elephant", "tiger"));
        assertEquals(expected, Shiritori.theGame(words));

    }

    @Test
    public void TestEmpty() {
        ArrayList<String> words = new ArrayList<>();
        assertEquals(new ArrayList<String>(), Shiritori.theGame(words));

    }

    @Test
    public void TestEStrings() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("", "", "", "", "", "", ""));
        assertEquals(new ArrayList<String>(), Shiritori.theGame(words));
    }

    @Test
    public void TestMidEStrings() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("ab", "bc", "", "de", "", "", ""));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("ab", "bc"));
        assertEquals(expected, Shiritori.theGame(words));
    }
}