package com.example.designpattern.adapter;

public class VividFilter implements  Filter{

    @Override
    public void doFilter(Image image) {
        System.out.println("vivid filter run");
    }
}
