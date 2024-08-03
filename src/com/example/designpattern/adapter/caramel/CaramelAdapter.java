package com.example.designpattern.adapter.caramel;

import com.example.designpattern.adapter.Filter;
import com.example.designpattern.adapter.Image;

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void doFilter(Image image) {
        init();
        applyFilter(image);
    }
}
