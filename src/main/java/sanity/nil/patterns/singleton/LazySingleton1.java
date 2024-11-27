package sanity.nil.patterns.singleton;

public class LazySingleton1 {

    private LazySingleton1() {}

    private static class SingletonHolder {
        private static final LazySingleton1 INSTANCE = new LazySingleton1();
    }

    public static LazySingleton1 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doWork() {
        System.out.println("Singleton class is working...");
    }

    public static void main(String[] args) {
        LazySingleton1.getInstance().doWork();
    }
}
