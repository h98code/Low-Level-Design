package HD.LLD.DesignPatterns.Behavioural.Strategy;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with credit card...");
    }
}
