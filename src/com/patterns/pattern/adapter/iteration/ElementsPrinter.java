package com.patterns.pattern.adapter.iteration;

import java.util.Iterator;

public class ElementsPrinter {

    private final Iterator<Integer> iterator;

    public ElementsPrinter(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public void printElements() {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}