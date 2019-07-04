package com.stackroute;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class SortNamesTest {
    SortNames sortNames;

    @Before
    public void setUp() throws Exception {
        sortNames = new SortNames();
    }

    @After
    public void tearDown() throws Exception {
        sortNames = null;
    }

    @Test
    public void testGivenNamesReturnAscendingOrder() {
        String[] stringArray = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};

        String expected = "[Alice, Bluto, Eugene, Harry, Olive]";
        String result = sortNames.sortAsc(stringArray);
        assertEquals(expected, result);
        assertNotNull(result);
    }

    @Test
    public void testGivenNamesStartingWithAReturnAscending() {
        String[] stringArray = {"Ali", "Alice", "Ani", "Angel"};

        String expected = "[Ali, Alice, Angel, Ani]";
        String result = sortNames.sortAsc(stringArray);
        assertEquals(expected, result);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testGivenNull() {
        String result = sortNames.sortAsc(null);

    }

    @Test
    public void testGivenNumbers()

    {
        String[] stringArray = {"3", "2", "1", "4"};
        String result = sortNames.sortAsc(stringArray);
        String expected = "[1, 2, 3, 4]";
        assertEquals(expected,result);
    }

    @Test
    public void testGivenSpecialCharacters()
    {
        String[] stringArray = {"@", "!", "*", "?"};
        String result = sortNames.sortAsc(stringArray);
        String expected = "[!, *, ?, @]";
        assertEquals(expected,result);
    }
}