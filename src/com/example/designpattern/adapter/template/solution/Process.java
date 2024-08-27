package com.example.designpattern.adapter.template.solution;

import com.example.designpattern.adapter.template.CustomerDetail;

public abstract class Process {

    private CustomerDetail customerDetail;

    public Process() {
       customerDetail=new CustomerDetail("Anna","London");
    }

    public void saveCustomer() {
        System.out.println("save Customer is running" );
        customerDetail.getCustomerInfo();
        processCustomer();

    }
    protected abstract void processCustomer();
}
