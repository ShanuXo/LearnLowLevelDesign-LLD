package StructuralDesignPattern.DecoratorDesignPattern.Topping;

import StructuralDesignPattern.DecoratorDesignPattern.BasePizzaForAll.BasePizza;
import StructuralDesignPattern.DecoratorDesignPattern.Topping.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }

}
