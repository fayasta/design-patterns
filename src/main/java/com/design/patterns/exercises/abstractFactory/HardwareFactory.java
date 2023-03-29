package com.design.patterns.exercises.abstractFactory;

public class HardwareFactory {
    
    private HardwareFactory(){
    }

    //this needs to return either Mouse or Keyboard
    public static IHardware createHardware(String type, boolean isGaming){
        String itemType = isGaming ? "gaming" : "basic";
        switch(type){
            case "mouse" : return MouseFactory.createMouse(itemType);
            case "keyboard" : return KeyboardFactory.createKeyboard(itemType);
            default: throw new UnsupportedOperationException();
        }
    }
}
