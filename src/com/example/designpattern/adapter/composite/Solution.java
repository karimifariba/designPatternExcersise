package com.example.designpattern.adapter.composite;

import com.example.designpattern.adapter.composite.caramel.CaramelAdapter;

public class Solution {
    public static void main(String[] args) {
        var imageViewer=new ImageViewer(new Image());
//        var caramrl=new Caramel();
//        imageViewer.apply(new CaramelFilter(caramrl));
        imageViewer.apply(new CaramelAdapter());
    }
}
