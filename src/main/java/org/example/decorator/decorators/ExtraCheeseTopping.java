package org.example.decorator.decorators;

import org.example.decorator.model.Pizza;

//is-a relationship with Pizza (via ToppingDecorator)
public class ExtraCheeseTopping extends ToppingDecorator {
    //has-a relationship with Pizza
    private final Pizza pizza;

    public ExtraCheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 80 + pizza.getCost();
    }
}
