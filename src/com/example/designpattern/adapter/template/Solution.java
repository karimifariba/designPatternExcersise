package com.example.designpattern.adapter.template;

import com.example.designpattern.adapter.template.solution.Task;
import com.example.designpattern.adapter.template.solution.TransferMoney;

public class Solution {
    public static void main(String[] args) {
        Task task=new TransferMoney();
//        task.doExecute();
        task.execute();
    }
}
