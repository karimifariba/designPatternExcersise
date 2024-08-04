package com.example.designpattern.adapter.memento;

import java.util.List;

public class Employee {
    private String name;
    private Short state;

    public EmployeeState createState() {
        return new EmployeeState(state,name);
    }
    public void reStoreState(EmployeeState state) {
        this.name=state.getName();
        this.state=state.getState();
        this.printEmployee();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Employee(String name, Short state) {
        this.name = name;
        this.state = state;
    }
    private void printEmployee() {
        System.out.println("employee{ name: "+ this.name + " state: "+ this.state+"}");
    }
}
