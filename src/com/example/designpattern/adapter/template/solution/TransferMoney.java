package com.example.designpattern.adapter.template.solution;

import com.example.designpattern.adapter.template.AuditTrail;

public class TransferMoney extends Task{
   /* public TransferMoney(AuditTrail auditTrail) {
        super(auditTrail);
    }*/

    @Override
    protected void doExecute() {
        System.out.println("solution :Transfer Money ");
    }
}
