package HD.LLD.DesignPatterns.Behavioural.Observer;

public class MobileAppSubscriber implements Subscriber {

    private String name;

    public MobileAppSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title) {
        System.out.println(name + " received notification: " + title);
    }
}
