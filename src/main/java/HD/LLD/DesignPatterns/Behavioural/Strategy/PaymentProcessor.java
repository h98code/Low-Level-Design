package HD.LLD.DesignPatterns.Behavioural.Strategy;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        paymentStrategy.processPayment();
    }
}
