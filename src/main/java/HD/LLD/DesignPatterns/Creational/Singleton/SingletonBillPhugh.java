package HD.LLD.DesignPatterns.Creational.Singleton;

public class SingletonBillPhugh {
    private SingletonBillPhugh() {}

    private static class SingletonHelper{
        private static final SingletonBillPhugh INSTANCE = new SingletonBillPhugh();
    }

    public static SingletonBillPhugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
