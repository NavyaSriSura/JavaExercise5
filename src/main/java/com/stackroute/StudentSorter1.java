package com.stackroute;

import java.util.Comparator;

public class StudentSorter1 implements Comparator<StudentSorter> {
    @Override
    public int compare(StudentSorter obj1, StudentSorter obj2)
    {
        if (obj1.age == obj2.age) {
            if (obj1.name == obj2.name) {
                if (obj1.id == obj2.id) {
                    return 0;
                } else if (obj1.id > obj2.id) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return 1;
            }
        } else if (obj1.age > obj2.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
