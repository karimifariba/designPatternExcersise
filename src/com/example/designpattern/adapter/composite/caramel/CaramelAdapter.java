package com.example.designpattern.adapter.composite.caramel;

import com.example.designpattern.adapter.composite.Filter;
import com.example.designpattern.adapter.composite.Image;

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void doFilter(Image image) {
        init();
        applyFilter(image);
    }
}
