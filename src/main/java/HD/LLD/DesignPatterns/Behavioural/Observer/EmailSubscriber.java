package HD.LLD.DesignPatterns.Behavioural.Observer;

public class EmailSubscriber implements Subscriber {

    String name;
    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title) {
        System.out.println(name + " received update: " + title);
    }
}
