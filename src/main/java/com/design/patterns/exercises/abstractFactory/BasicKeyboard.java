package com.design.patterns.exercises.abstractFactory;

public class BasicKeyboard implements IHardware {

    @Override
    public void create() {
        System.out.println("Basic Keyboard was created");
    }
    
}
