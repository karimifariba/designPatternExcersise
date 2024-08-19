package com.example.designpattern.adapter.iterator.solution;

public interface Iterator<T> {
    Boolean hasNext();

    void next();

    T currentItem();
}
