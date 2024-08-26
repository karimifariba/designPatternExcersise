package com.example.designpattern.adapter.template;

public class ReportMoney {
    private AuditTrail auditTrail;
    public ReportMoney(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }
     public void execute(){
         System.out.println(" Report Money is running");
         auditTrail.record();
     }
}
