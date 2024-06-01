package TemplateMethodDesignPattern;

import TemplateMethodDesignPattern.Payment.PaymentFlow;
import TemplateMethodDesignPattern.Payment.paymentToFriend;

public class Client {
    public static void main(String[] args) {
        PaymentFlow payment = new paymentToFriend();
        payment.sendMoney();
    }
}
