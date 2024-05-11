package TemplateMethodDesignPattern.Payment;

public class paymentToMerchant extends PaymentFlow {
    @Override
    public void ValidateRequest() {
        System.out.println("Validation Successfully");
    }

    @Override
    public void DebitAmount() {
        System.out.println("Amount has been debited");
    }

    @Override
    public void calculateFees() {
        System.out.println("13 % charges");
    }

    @Override
    public void creditAmount() {
        System.out.println("Amout has been credited");
    }
}
