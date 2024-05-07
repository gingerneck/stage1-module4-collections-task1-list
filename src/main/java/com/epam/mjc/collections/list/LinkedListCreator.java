package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        var res = new LinkedList<Integer>();
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                res.addLast(num);
            } else {
                res.addFirst(num);
            }
        }
        return res;
    }
}
