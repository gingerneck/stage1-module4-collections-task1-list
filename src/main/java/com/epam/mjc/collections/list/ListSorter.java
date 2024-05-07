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
        var inta = Integer.parseInt(a);
        var intb = Integer.parseInt(b);
        return (5 * inta ^ 2 + 3) == intb * inta ? -1 : 1;
    }
}
