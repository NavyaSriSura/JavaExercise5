package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class RepeatCharTest
{
    RepeatChar repeatChar;
    @Before
    public void setUp()
    {
        repeatChar=new RepeatChar();
    }
    @After
    public void tearDown()
    {
        repeatChar=null;
    }

    @Test
    public void testOfListReturnBoolean() throws IOException {

        String input[]={"a","b","c","d","a","c","c"};
        HashMap actual= repeatChar.checkCharacter(input);

        HashMap expected= new HashMap();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);

        assertEquals("msg",expected,actual);

        assertNotNull(repeatChar);
        assertEquals(expected,actual);
    }

    @Test
    public void testGivenSpecialCharacters()
    {
        String input[]={"@","!","@","?","!"};
        HashMap actual=repeatChar.checkCharacter(input);

        HashMap expected=new HashMap();
        expected.put("@",true);
        expected.put("!",true);
        expected.put("?",false);

        assertEquals(expected,actual);
        assertNotNull(repeatChar);
    }

    @Test
    public void testGivenNumbers()
    {
        String input[]={"1","2","2","1","3"};
        HashMap actual=repeatChar.checkCharacter(input);

        HashMap expected=new HashMap();
        expected.put("1",true);
        expected.put("2",true);
        expected.put("3",false);

        assertNotNull(repeatChar);
        assertEquals(expected,actual);

    }
}