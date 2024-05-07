package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        var res = new ArrayList<String>();
        for (int i = 0; i < sourceList.size(); i++) {
            if ((i + 1) % 3 == 0) {
                var sel = (String) sourceList.get(i);
                res.add(sel);
                res.add(sel);
            }
        }
        return res;
    }
}
