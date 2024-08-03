package com.example.designpattern.adapter;

import com.example.designpattern.adapter.caramel.Caramel;
import com.example.designpattern.adapter.caramel.CaramelAdapter;
import com.example.designpattern.adapter.caramel.CaramelFilter;

public class Solution {
    public static void main(String[] args) {
        var imageViewer=new ImageViewer(new Image());
//        var caramrl=new Caramel();
//        imageViewer.apply(new CaramelFilter(caramrl));
        imageViewer.apply(new CaramelAdapter());
    }
}
