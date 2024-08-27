package com.example.designpattern.adapter.template;

public class Customer {

    public static void main(String[] args) {
      var auditTrail = new CustomerDetail("Jones","Paris");

        var legalCustomer=new LegalCustomer(auditTrail);
        var realCustomer=new RealCustomer(auditTrail);
        legalCustomer.saveCustomer();
        realCustomer.saveCustomer();
    }

}
