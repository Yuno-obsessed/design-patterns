package sanity.nil.patterns.singleton;

public enum LazySingleton2 {
    INSTANCE;

    public void doWork() {
        System.out.println("Singleton class is working...");
    }

    public static void main(String[] args) {
        LazySingleton2.INSTANCE.doWork();
    }
}
