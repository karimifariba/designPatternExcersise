package com.example.designpattern.adapter.template;

public class CustomerDetail {
    private String customerName;
    private String customerAddress;

    public CustomerDetail(String customerName, String customerAddress) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public void getCustomerInfo() {
        System.out.println("Customer : " + customerName + " Address is: " + customerAddress);

    }


}
