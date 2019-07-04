package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWords
{
    public String checkFrequency(String input) {
        //condition to check if given input is null
        if (input == null)
            return null;
        //splitting them on basis of non-word characters
        List<String> stringList = Arrays.asList(input.split("[\\W_]+"));
        Map<String, Integer> map = new HashMap<>();
        for (String each : stringList) {
            if (map.containsKey(each)) {
                //incrementing the value if map already contains key
                map.replace(each, map.get(each) + 1);
            } else
                //adding the key initially and assigning value as 1
                {
                map.put(each, 1);
                }
        }
        //converting map to String type
        return map.toString();
    }
}
