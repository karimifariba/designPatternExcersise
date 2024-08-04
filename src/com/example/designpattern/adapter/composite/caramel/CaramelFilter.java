package com.example.designpattern.adapter.composite.caramel;

import com.example.designpattern.adapter.composite.Filter;
import com.example.designpattern.adapter.composite.Image;

public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }


    @Override
    public void doFilter(Image image) {
        caramel.init();
        caramel.applyFilter(image);
    }
}
