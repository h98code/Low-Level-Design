package HD.LLD.DesignPatterns.Behavioural.Strategy;

public class Cheque implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with cheque ...");
    }
}
