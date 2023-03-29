package com.design.patterns.exercises.adapter;

public class RoundHole {
    
    double radio;

    public RoundHole(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public boolean fits(RoundThing roundThing){
        System.out.println(this.getRadio());
        System.out.println(roundThing.getRadio());
        return this.getRadio() >= roundThing.getRadio();
    }

}
