package com.example.designpattern.adapter.template.solution;

import com.example.designpattern.adapter.template.AuditTrail;

public class ReportMoney extends Task{
   /* public ReportMoney(AuditTrail auditTrail) {
        super(auditTrail);
    }*/

    @Override
    protected void doExecute() {
        System.out.println("solution :Report Money ");
    }
}
