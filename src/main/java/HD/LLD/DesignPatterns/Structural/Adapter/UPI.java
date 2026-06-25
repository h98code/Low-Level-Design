package HD.LLD.DesignPatterns.Structural.Adapter;

public class UPI implements PaymentGateway{

    @Override
    public void pay(double amount) {
        System.out.println("Processing payment with UPI..." + amount);
    }
}
