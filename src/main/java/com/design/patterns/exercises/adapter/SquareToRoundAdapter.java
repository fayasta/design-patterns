package com.design.patterns.exercises.adapter;


// This needs to extend RoundThing and their methods.
// For example: getRadio(). For this case, the method getRadio() has a different logic. 
// The logic is created to change the side of a square to radio for a rounded hole.
// Notice that the method "getRadio" is the one that defines if the element can fit in the hole. 
// That's why we change the logic.
public class SquareToRoundAdapter extends RoundThing{

    // An adapter class lets you fit square things into round holes.
    // It extends the RoundPeg class to let the adapter objects act
    // as round things.

    public SquareThing squareThing;

    public SquareToRoundAdapter(SquareThing squareThing){
        this.squareThing = squareThing;
    }

    //this method needs to be named in the same as the RoundThing method. 
    public double getRadio(){
        return squareThing.getSide()*Math.sqrt(2)/2;
    }

}
