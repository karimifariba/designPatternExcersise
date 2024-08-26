package com.example.designpattern.adapter.template;

public class Template {

    public static void main(String[] args) {
      AuditTrail auditTrail = new AuditTrail();

        ReportMoney reportMoney=new ReportMoney(auditTrail);
        TransferMoney transferMoney=new TransferMoney(auditTrail);
        reportMoney.execute();
        transferMoney.execute();
    }

}
