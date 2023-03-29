package com.design.patterns.exercises.abstractFactory;

public class KeyboardFactory {
    

    public KeyboardFactory(){

    }

    public static IHardware createKeyboard(String type){
        switch(type){
            case "basic" : return new BasicKeyboard();
            case "gaming" : return new GamingKeyboard();
            default: throw new UnsupportedOperationException();
        }
    }

}
