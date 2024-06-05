package StructuralDesignPattern.DecoratorDesignPattern.Topping;

import StructuralDesignPattern.DecoratorDesignPattern.BasePizzaForAll.BasePizza;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
