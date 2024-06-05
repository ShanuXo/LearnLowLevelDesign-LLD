package StructuralDesignPattern.DecoratorDesignPattern;

import StructuralDesignPattern.DecoratorDesignPattern.BasePizzaForAll.BasePizza;
import StructuralDesignPattern.DecoratorDesignPattern.BasePizzaForAll.Margherita;
import StructuralDesignPattern.DecoratorDesignPattern.Topping.ExtraCheese;

public class Client {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese((new Margherita()));
        System.out.println(pizza.cost());
    }

}
