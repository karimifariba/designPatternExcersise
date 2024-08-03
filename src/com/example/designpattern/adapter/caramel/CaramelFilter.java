package com.example.designpattern.adapter.caramel;

import com.example.designpattern.adapter.Filter;
import com.example.designpattern.adapter.Image;

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
