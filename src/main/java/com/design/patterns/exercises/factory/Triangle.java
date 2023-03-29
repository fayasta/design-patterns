package com.design.patterns.exercises.factory;

public class Triangle implements IShape{

    private String type;

    public Triangle(String type){
        this.type = type;
    }

    @Override
    public void printNameOfShape() {
        System.out.println("This is a triangle");
        System.out.println("and it is a "+ getType());
    }

    public String getType() {
        return type;
    }
    
}
