package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort((a, b) -> new ListComparator().compare(a, b));
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        int res = Integer.compare(Math.abs(first), Math.abs(second));
        if (res == 0) {
            res = Integer.compare(first, second);
        }
        return res;
    }
}
