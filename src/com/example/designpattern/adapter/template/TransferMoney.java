package com.example.designpattern.adapter.template;

public class TransferMoney {
    private AuditTrail auditTrail;
    public TransferMoney(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }
    public void execute(){
        System.out.println(" Transfer Money is running");
        auditTrail.record();
    }
}
