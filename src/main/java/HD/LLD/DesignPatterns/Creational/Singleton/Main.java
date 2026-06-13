package HD.LLD.DesignPatterns.Creational.Singleton;

public class Main {
    public static void main(String[] args) {

        SingletonBillPhugh instance = SingletonBillPhugh.getInstance();
        SingletonBillPhugh instance2 = SingletonBillPhugh.getInstance();

//        SingletonEager instance = SingletonEager.getInstance();
//        System.out.println(instance);

//        SingletonEager instance2 = SingletonEager.getInstance();
//        System.out.println(instance2);

        if(instance == instance2){
            System.out.println("instance == instance2");
        } else {
            System.out.println("instance != instance2");
        }
    }
}
