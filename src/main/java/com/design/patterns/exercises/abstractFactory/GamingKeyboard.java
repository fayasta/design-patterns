package com.design.patterns.exercises.abstractFactory;

public class GamingKeyboard implements IHardware{

    @Override
    public void create() {
        System.out.println("Gaming Keyboard was created");
    }
    
}
