package com.example.designpattern.adapter;

import com.example.designpattern.adapter.caramel.Caramel;
import com.example.designpattern.adapter.caramel.CaramelAdapter;
import com.example.designpattern.adapter.caramel.CaramelFilter;

public class Problem {
    public static void main(String[] args) {
        var imageViewer=new ImageViewer(new Image());
        imageViewer.apply(new VividFilter());
//        imageViewer.apply(new Caramel());
        imageViewer.apply(new CaramelAdapter());

    }
}
