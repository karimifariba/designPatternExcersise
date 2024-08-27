package com.example.designpattern.adapter.template;

public class LegalCustomer {
    private CustomerDetail customerDetail;
    public LegalCustomer(CustomerDetail customerDetail) {

        this.customerDetail = customerDetail;
    }
    public void saveCustomer(){
        System.out.println(" Legal Customer is running");
        customerDetail.getCustomerInfo();
    }
}
