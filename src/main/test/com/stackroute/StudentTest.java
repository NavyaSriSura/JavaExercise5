package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
Student student;
    @Before
    public void setUp() throws Exception
    {
        student=new Student();
    }

    @After
    public void tearDown() throws Exception
    {
        student=null;
    }

    @Test
    public void test1() throws IOException {


        ArrayList<StudentSorter> Expected = new ArrayList<StudentSorter>();
        ArrayList<StudentSorter> actual= new ArrayList<StudentSorter>();
        Expected.add(new StudentSorter(1, "monu",24));
        Expected.add(new StudentSorter(9, "monu",24));
        Expected.add(new StudentSorter(10, "tina",24));
        Expected.add(new StudentSorter(2, "sonu",23));
        Expected.add(new StudentSorter(3, "upasana",22));
        Expected.add(new StudentSorter(7, "sonu",21));



        actual = student.check();
        Assert.assertEquals(Expected.toString(), actual.toString());
        assertNotNull(student);

    }

}