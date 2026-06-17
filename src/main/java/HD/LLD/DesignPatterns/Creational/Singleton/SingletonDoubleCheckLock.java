package HD.LLD.DesignPatterns.Creational.Singleton;

public class SingletonDoubleCheckLock {
    public static volatile SingletonDoubleCheckLock instance;

    private SingletonDoubleCheckLock() {}

    public static SingletonDoubleCheckLock getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckLock.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckLock();
                }
            }
        }
        return instance;
    }
}
