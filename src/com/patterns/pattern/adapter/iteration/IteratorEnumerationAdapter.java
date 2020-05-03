package com.patterns.pattern.adapter.iteration;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerationAdapter implements Iterator<Integer> {

    private Enumeration<Integer> elements;

    public IteratorEnumerationAdapter(Enumeration<Integer> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return elements.hasMoreElements();
    }

    @Override
    public Integer next() {
        return elements.nextElement();
    }

}