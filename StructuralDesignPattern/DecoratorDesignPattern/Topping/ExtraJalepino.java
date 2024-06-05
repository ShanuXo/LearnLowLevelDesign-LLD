package StructuralDesignPattern.DecoratorDesignPattern.Topping;

import StructuralDesignPattern.DecoratorDesignPattern.BasePizzaForAll.BasePizza;

public class ExtraJalepino extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraJalepino(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 35;
    }
}
