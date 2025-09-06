package org.example.decorator;

import org.example.decorator.decorators.ExtraCheeseTopping;
import org.example.decorator.decorators.MushroomTopping;
import org.example.decorator.model.Farmhouse;
import org.example.decorator.model.Pizza;

public class DecoratorPatternRunner {
    public static void main(String[] args) {
        /**
         * Decorator is in both is-a and has-a relationship with Base class
         * You decorate the has-a base object inside the decorator class passed via constructor
         * And decorator itself is-a base class and so can be easily substituted
         * NOTE: both base and decorator are ABSTRACT classes
         */

        //Base object
        Pizza pizza = new Farmhouse();
        System.out.println("Base Pizza Cost: " + pizza.getCost());

        //Decorate with Extra Cheese
        Pizza cheesePizza = new ExtraCheeseTopping(pizza);
        System.out.println("After adding Extra Cheese, Pizza Cost: " + cheesePizza.getCost());

        //Decorate with Mushroom
        Pizza mushroomCheesePizza = new MushroomTopping(cheesePizza);
        System.out.println("After adding Mushroom, Pizza Cost: " + mushroomCheesePizza.getCost());

        // Chaining decorators
        Pizza fullyLoadedPizza = new MushroomTopping(new ExtraCheeseTopping(new ExtraCheeseTopping(new Farmhouse())));
        System.out.println("Fully loaded (Double Cheese + Mushroom) Pizza Cost: " + fullyLoadedPizza.getCost());

    }
}
