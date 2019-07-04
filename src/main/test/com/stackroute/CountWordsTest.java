package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CountWordsTest {
    CountWords countWords;

    @Before
    public void setUp() throws Exception {
        countWords = new CountWords();
    }

    @After
    public void tearDown() throws Exception {
        countWords = null;
    }

    @Test
    public void testOfListReturnFrequency() throws IOException {

        String expected = "{one=5, two=2, three=2}";
        String str = "one one -one___two,,three,one @three*one?two";
        String actual = countWords.checkFrequency(str);

        assertEquals("TestCase Passed", expected, actual);

        assertNotNull(countWords);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckFrequencyNull() {

        String actual = countWords.checkFrequency(null);
        assertNull(actual);
    }

    @Test
    public void testCheckFrequencyNotNull() {

        String actual = countWords.checkFrequency("i am Batman");
        String expected = "{Batman=1, i=1, am=1}";
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckNumbers() {
        String actual = countWords.checkFrequency("1 1 2 2 3 3 4 4");
        String expected = "{1=2, 2=2, 3=2, 4=2}";
        assertEquals(expected,actual);
    }
    @Test
    public void testCheckSpecialCharacters()
    {
        String actual=countWords.checkFrequency("@ ! # @ !");
        String expected="{}";
        assertEquals(expected,actual);
    }

}