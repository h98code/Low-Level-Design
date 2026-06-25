package HD.LLD.DesignPatterns.Structural.Adapter;

public class RazorPayAdapter implements PaymentGateway{

    @Override
    public void pay(double amount) {
        RazorPay razorPay = new RazorPay();
        razorPay.payment(amount);
    }
}
