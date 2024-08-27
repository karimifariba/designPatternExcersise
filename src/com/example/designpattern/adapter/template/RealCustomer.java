package com.example.designpattern.adapter.template;

public class RealCustomer {

    private CustomerDetail customerDetail;
    public RealCustomer(CustomerDetail customerDetail) {

        this.customerDetail = customerDetail;
    }
    public void saveCustomer(){
        System.out.println(" Real Customeris running");
        customerDetail.getCustomerInfo();
    }
}
