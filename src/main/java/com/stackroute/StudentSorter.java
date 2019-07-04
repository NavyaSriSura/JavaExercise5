package com.stackroute;

public class StudentSorter
{
    int id;
    String name;
    int age;

    StudentSorter(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "StudentSorter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
