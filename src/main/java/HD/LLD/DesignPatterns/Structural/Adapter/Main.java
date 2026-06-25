package HD.LLD.DesignPatterns.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new RazorPayAdapter();
        paymentGateway.pay(5000);
    }
}
