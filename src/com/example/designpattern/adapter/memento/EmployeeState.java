package com.example.designpattern.adapter.memento;

public class EmployeeState {
    private Short state;
    private String name;

    public EmployeeState(Short state, String name) {
        this.state = state;
        this.name = name;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
