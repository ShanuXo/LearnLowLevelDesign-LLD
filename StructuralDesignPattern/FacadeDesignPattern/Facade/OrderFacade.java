package StructuralDesignPattern.FacadeDesignPattern.Facade;

import StructuralDesignPattern.FacadeDesignPattern.Products.Product;
import StructuralDesignPattern.FacadeDesignPattern.System.GenerateInvoice;
import StructuralDesignPattern.FacadeDesignPattern.System.Notification;
import StructuralDesignPattern.FacadeDesignPattern.System.Payment;
import StructuralDesignPattern.FacadeDesignPattern.System.ProductDAO;

public class OrderFacade {
    ProductDAO productDAO;
    GenerateInvoice invoice;
    Payment payment;
    Notification notification;

    public OrderFacade()
    {
        productDAO = new ProductDAO();
        invoice = new GenerateInvoice();
        payment = new Payment();
        notification = new Notification();
    }

    public void createOrder()
    {
        Product product = productDAO.getProduct(121);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
        //Order creation successfully
    }

}
