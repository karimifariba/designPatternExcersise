package com.example.designpattern.adapter.iterator;

public class Problem {
    public static void main(String[] args) {
        var c=new AccountCollection();
        c=new AccountCollection();

         c.pushAccount("54654365496");
         c.pushAccount("51484");
         c.pushAccount("235641");
         c.pushAccount("2156564");
         for(int i=0;i<c.getAccounts().size();i++){
             System.out.println(c.getAccounts().get(i));
         }
    }
}
