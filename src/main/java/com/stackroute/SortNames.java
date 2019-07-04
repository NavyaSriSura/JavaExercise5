package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SortNames {
    public String sortAsc(String[] s) {
        List<String> sortedList;
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < s.length; i++)
        {
            set.add(s[i]);//treeset adds elements in ascending order
        }
        //converting sorted set into arraylist
        sortedList = new ArrayList<String>(set);
        return sortedList.toString();
    }
}