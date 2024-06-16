package StructuralDesignPattern.FacadeDesignPattern;

import StructuralDesignPattern.FacadeDesignPattern.Facade.OrderFacade;

public class Client {
    public static void main(String[] args) {
        {
            OrderFacade orderFacade = new OrderFacade();
            orderFacade.createOrder();
        }
    }
}
