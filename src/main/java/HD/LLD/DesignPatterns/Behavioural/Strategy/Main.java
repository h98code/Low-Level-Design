package HD.LLD.DesignPatterns.Behavioural.Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCard());

        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStrategy(new Cheque());
        paymentProcessor.processPayment();
    }
}
