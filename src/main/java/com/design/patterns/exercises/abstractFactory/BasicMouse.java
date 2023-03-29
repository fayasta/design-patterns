package com.design.patterns.exercises.abstractFactory;

public class BasicMouse implements IHardware {

    @Override
    public void create() {
        System.out.println("Basic mouse was created");
    }
    
}
