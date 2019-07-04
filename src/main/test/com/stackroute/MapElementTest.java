package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapElementTest {
MapElement mapElement;
    @Before
    public void setUp() throws Exception
    {
        mapElement=new MapElement();
    }

    @After
    public void tearDown() throws Exception
    {
        mapElement=null;
    }

    @Test
    public void testGivenValuesReturnEmptyValue2() {
        String expexted="{val2=java, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        String actual=mapElement.rotateValue(map);
        assertEquals(expexted,actual);
    }

    @Test
    public void testGivenValuesReturnResult() {
        String expexted="{val2=mars, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","mars");
        map.put("val2","saturn");
        String actual=mapElement.rotateValue(map);
        assertEquals(expexted,actual);
    }

    @Test
    public void testGivenNull() {

        String actual=mapElement.rotateValue(null);
        assertNull(actual);
    }
}