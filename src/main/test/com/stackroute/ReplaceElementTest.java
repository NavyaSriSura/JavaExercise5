package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReplaceElementTest {
ReplaceElement replaceElement;
    @Before
    public void setUp() throws Exception
    {
        replaceElement=new ReplaceElement();
    }

    @After
    public void tearDown() throws Exception
    {
        replaceElement=null;
    }
    @Test
    public void testGivenArrayListReplaceElements() throws IOException {


        ArrayList<String> Expected= new ArrayList<String>();
        Expected.add("Kiwi");
        Expected.add("Grape");
        Expected.add("Mango");
        Expected.add("Berry");

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual= replaceElement.checkList(arrayList);
        assertEquals(Expected,actual);

        assertNotNull(replaceElement);

    }

    @Test
    public void testGivenArrayListReturnEmptyList() throws IOException {


        ArrayList<String> Expected= new ArrayList<String>();

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual= replaceElement.removeList(arrayList);
        assertEquals(Expected,actual);

        assertNotNull(replaceElement);

    }
}