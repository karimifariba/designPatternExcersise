package com.example.designpattern.adapter.iterator.solution;


public class Solution {
    public static void main(String[] args) {
        var c=new AccountCollection();

        c.pushAccount("54654365496");
        c.pushAccount("51484");
        c.pushAccount("235641");
        c.pushAccount("2156564");
        var iterator=c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
        System.out.println("--------------------------");
        c.popAccount();
        iterator=c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
