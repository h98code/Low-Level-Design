package HD.LLD.DesignPatterns.Creational.Singleton;

public class SingletonEager {
    public static final SingletonEager instance = new  SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return instance;
    }
}
