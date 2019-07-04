package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;

public class Student
{
    public ArrayList<StudentSorter> check() {

        ArrayList<StudentSorter> obj = new ArrayList<StudentSorter>();
        obj.add(new StudentSorter(3, "upasana", 22));
        obj.add(new StudentSorter(1, "monu", 24));
        obj.add(new StudentSorter(2, "sonu", 23));
        obj.add(new StudentSorter(7, "sonu", 21));
        obj.add(new StudentSorter(9, "monu", 24));
        obj.add(new StudentSorter(10, "tina", 24));

        StudentSorter1 c = new StudentSorter1();
        Collections.sort(obj, c);

        return obj;
    }
}
