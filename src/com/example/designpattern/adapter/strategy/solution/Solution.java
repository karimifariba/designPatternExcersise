package com.example.designpattern.adapter.strategy.solution;

public class Solution {
    public static void main(String[] args) {

      /*  var customer = new Customer(new RealCustomer(), new ValuableGrade());
        customer.saveCustomer("James ");*/


        var customer = new Customer();
        customer.saveCustomer("James ",new RealCustomer(),new ValuableGrade());
        customer.saveCustomer("MVM ",new LegalCustomer(),new ValuableGrade());
        customer.saveCustomer("X ",new LegalCustomer(),new WeakGrade());
        customer.saveCustomer("Sara ",new RealCustomer(),new WeakGrade());
        customer.saveCustomer("Anna ",new RealCustomer(),new WeakGrade());

    }
}
