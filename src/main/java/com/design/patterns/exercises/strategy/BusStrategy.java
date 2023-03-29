package com.design.patterns.exercises.strategy;

public class BusStrategy implements Strategy{

    @Override
    public void execute() {
        System.out.println("The user is using a Bus");
    }
    
}
