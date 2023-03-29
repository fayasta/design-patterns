package com.design.patterns.exercises.factory;

public class Circle implements IShape{

    private int radio;

    public Circle(int radio){
        this.radio = radio;
    }

    @Override
    public void printNameOfShape() {
        System.out.println("this is a circle");
        System.out.println("and this is its radio: " + getRadio());
    }

    public int getRadio() {
        return radio;
    }

    
    
}
