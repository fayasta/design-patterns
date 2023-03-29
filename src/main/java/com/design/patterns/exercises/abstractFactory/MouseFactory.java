package com.design.patterns.exercises.abstractFactory;

public class MouseFactory {

    public MouseFactory(){

    }

    public static IHardware createMouse(String type){
        switch(type){
            case "basic" : return new BasicMouse();
            case "gaming" : return new GamingMouse();
            default: throw new UnsupportedOperationException();
        }
    }
    
}
