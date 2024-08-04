package com.example.designpattern.adapter.composite;

import com.example.designpattern.adapter.composite.caramel.CaramelAdapter;

public class Problem {
    public static void main(String[] args) {
        var imageViewer=new ImageViewer(new Image());
        imageViewer.apply(new VividFilter());
//        imageViewer.apply(new Caramel());
        imageViewer.apply(new CaramelAdapter());

    }
}
