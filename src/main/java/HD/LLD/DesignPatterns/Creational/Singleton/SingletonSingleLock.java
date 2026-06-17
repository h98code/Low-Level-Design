package HD.LLD.DesignPatterns.Creational.Singleton;

public class SingletonSingleLock {
    private static volatile SingletonSingleLock instance;

    private SingletonSingleLock() {}

    public synchronized static SingletonSingleLock getInstance() {
        if (instance == null) {
            instance = new SingletonSingleLock();
        }
        return instance;
    }
}
