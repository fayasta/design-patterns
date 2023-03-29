package com.design.patterns.exercises;

import com.design.patterns.exercises.abstractFactory.HardwareFactory;
import com.design.patterns.exercises.abstractFactory.IHardware;
import com.design.patterns.exercises.adapter.RoundHole;
import com.design.patterns.exercises.adapter.RoundThing;
import com.design.patterns.exercises.adapter.SquareThing;
import com.design.patterns.exercises.adapter.SquareToRoundAdapter;
import com.design.patterns.exercises.factory.IShape;
import com.design.patterns.exercises.factory.ShapeFactory;
import com.design.patterns.exercises.strategy.BusStrategy;
import com.design.patterns.exercises.strategy.BycicleStrategy;
import com.design.patterns.exercises.strategy.CarStrategy;
import com.design.patterns.exercises.strategy.Context;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 1. Testing Pattern: Factory
        IShape triangle = ShapeFactory.createShape("triangle");
        triangle.printNameOfShape();

        IShape circle = ShapeFactory.createShape("circle");
        circle.printNameOfShape();

        // 2. Testing Pattern: Abstract Factory
        /*
         * https://refactoring.guru/design-patterns/abstract-factory
         * Exercise: Mouse - Keyboard
         * each has different styles: Basic - Gaming
         */
        IHardware mouse = HardwareFactory.createHardware("mouse", true);
        mouse.create();

        IHardware mouse2 = HardwareFactory.createHardware("mouse", false);
        mouse2.create();

        IHardware keyboard = HardwareFactory.createHardware("keyboard", true);
        keyboard.create();

        IHardware keyboard2 = HardwareFactory.createHardware("keyboard", false);
        keyboard2.create();

        // 3. Testing Pattern: Strategy
        /*
         * The Strategy pattern suggests that you take a class that does something specific 
         * in a lot of different ways and extract all of these algorithms into 
         * separate classes called strategies.
         * Exercise: Waze 
         * You can go from A to B by: car, walking, bicycle, bus. 
         * Those option became the strategy that the user will use to go from A to B.
         */

         Context context = new Context(null);

         System.out.println("===========Car Strategy===========");
         context.setStrategy(new CarStrategy());
         context.executeStrategy();
         System.out.println("===========Bycicle Strategy===========");
         context.setStrategy(new BycicleStrategy());
         context.executeStrategy();
         System.out.println("===========Bus Strategy===========");
         context.setStrategy(new BusStrategy());
         context.executeStrategy();

         // 4. Testing Pattern: Adapter
         /* Say you have two classes with compatible interfaces:
         * RoundHole and RoundThing. 
         */
        RoundHole hole = new RoundHole(5);
        RoundThing roundThing = new RoundThing(5);
        String msg = hole.fits(roundThing)?"roundThing fits the hole":"roundThing does not fit the hole"; // true - And RoundThing can fit into RoundHole  
        System.out.println(msg);
        /*
          *  But there's an incompatible class: SquareThing. 
          But if we create a hole with the radius of the square's side size. 
          Then, the square would fit.
          */
        SquareThing squareThing_small_radius = new SquareThing(2);
        SquareThing squareThing_large_radius = new SquareThing(10);
        /*
         * this won't compile (incompatible types). 
         * That's why we need to use the adapter
         */
        //hole.fits(squareThing_small_radius); 

        SquareToRoundAdapter squareThing_small_radius_adapted = new SquareToRoundAdapter(squareThing_small_radius);
        SquareToRoundAdapter squareThing_large_radius_adapted = new SquareToRoundAdapter(squareThing_large_radius);
        msg = hole.fits(squareThing_small_radius_adapted)?"squareThing fits the hole":"squareThing does not fit the hole"; // true because hole=5 <= side=5
        System.out.println(msg);
        msg = hole.fits(squareThing_large_radius_adapted)?"squareThing fits the hole":"squareThing does not fit the hole"; // false because hole=5 <= side=10. This doesn't fit
        System.out.println(msg);

        // 5. Testing Pattern: Composite   

    }
}
