package HD.LLD.DesignPatterns.Behavioural.Strategy;

public class DebitCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with debit card...");
    }
}
