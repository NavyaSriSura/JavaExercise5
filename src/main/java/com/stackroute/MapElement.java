package com.stackroute;

import java.util.Map;

public class MapElement
{
    public String rotateValue(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        String val1 = map.get("val1");
        map.replace("val2", val1); //replacing value2 with value 1
        map.replace("val1", " "); //replacing value 1 to empty string
        return map.toString();
    }
}
