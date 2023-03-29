package com.design.patterns.exercises.factory;

public class ShapeFactory {
    
    

    public ShapeFactory() {
    }

    public static IShape createShape(String shapeName){

        switch(shapeName){
            case "triangle": return new Triangle("equilateral");
            case "circle": return new Circle(4);
            default: throw new UnsupportedOperationException();
        }
    }

}
