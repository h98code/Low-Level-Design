package HD.LLD.DesignPatterns.Behavioural.Observer;

import java.util.concurrent.Flow;

public interface Channel {

    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public void notifySubscribers(String title);
    public void uploadVideo(String videoTitle);
}
