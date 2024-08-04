package com.example.designpattern.adapter.memento;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHistory {

    private List<EmployeeState> states=new ArrayList<>();

    public EmployeeState pop(){
        var lastState=  states.get(states.size()-1);
        states.remove(states.size()-1);
        return lastState;
    }
    public void push(EmployeeState state){
        states.add(state);
    }
}
