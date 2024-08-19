package com.example.designpattern.adapter.strategy;

public class Customer {
    private  Byte customerType;
    private Byte customerGrade;

    public Customer(Byte customerType, Byte customerGrade) {
        this.customerType = customerType;
        this.customerGrade = customerGrade;
    }
    public void saveCustomer(String customerName) {
        if(customerType.equals(CustomerType.REAL_CUSTOMER_TYPE)){
            System.out.println("Customer Type is rEAL Customer");
        }else {
            System.out.println("Customer Type is Legal Customer");
        }

        if(customerGrade.equals(CustomerGrade.WEAK_CUSTOMER_GRADE)){
            System.out.println("Customer Grade is Weak Customer");
        }else if (customerGrade.equals(CustomerGrade.MIDDLE_CUSTOMER_GRADE)){
            System.out.println("Customer Grade is Middle Customer");
        }else {
            System.out.println("Customer Grade is Valuable Customer");
        }

    }
}
