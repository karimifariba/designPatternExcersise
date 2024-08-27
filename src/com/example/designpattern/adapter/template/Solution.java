package com.example.designpattern.adapter.template;

import com.example.designpattern.adapter.template.solution.LegalCustomer;
import com.example.designpattern.adapter.template.solution.Process;
import com.example.designpattern.adapter.template.solution.RealCustomer;

public class Solution {
    public static void main(String[] args) {
     /*   Task task=new TransferMoney();
//        task.doExecute();
        task.execute();
*/

        Process customer1=new LegalCustomer();
        customer1.saveCustomer();
        System.out.println("customer1 has been saved");
//        customer1.processCustomer();

       Process customer2=new RealCustomer();
        customer2.saveCustomer();
        System.out.println("customer2 has been saved");
//        customer2.processCustomer();

    }
}
