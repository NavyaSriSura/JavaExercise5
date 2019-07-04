package com.stackroute;

import java.util.ArrayList;

public class ReplaceElement
{
    public ArrayList checkList(ArrayList arrayList) {
        //this method replaces at particular index
        arrayList.set(0, "Kiwi");
        arrayList.set(2, "Mango");
        return arrayList;
    }

    public ArrayList removeList(ArrayList arrayList) {
        //this method clears the array list
        arrayList.clear();
        return arrayList;
    }
}
