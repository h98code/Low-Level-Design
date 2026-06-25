package HD.LLD.DesignPatterns.Behavioural.Observer;

public class Main {
    public static void main(String[] args) {
        Channel channel = new YoutubeChannel("TechWorld");

        Subscriber emailSubscriber = new EmailSubscriber("email subscriber");
        Subscriber appSubscriber = new MobileAppSubscriber("app subscriber");

        channel.subscribe(emailSubscriber);
        channel.subscribe(appSubscriber);

        channel.uploadVideo("Observer Design Pattern in Java");
        channel.unsubscribe(emailSubscriber);

        channel.uploadVideo("2nd video of the series");
    }
}
