package TemplateMethodDesignPattern.Payment;

public abstract class PaymentFlow {
    public abstract void ValidateRequest();

    public abstract void DebitAmount();

    public abstract void calculateFees();

    public abstract void creditAmount();

    public void sendMoney() {
        ValidateRequest();
        DebitAmount();
        calculateFees();
        creditAmount();
        System.out.println("Money Sent");
    }
}
