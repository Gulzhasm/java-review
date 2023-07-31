package com.gm;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        printDouble(items);
    }

    private static void printDouble(List<Integer> items) {
        for (Integer i : items) {
            System.out.print(" " + i * 3);
        }
    }
}
