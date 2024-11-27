package sanity.nil.patterns.state;

public class Main {
    public static void main(String[] args) {
        StorageContext storageContext = new StorageContext();

        storageContext.performAction();

        storageContext.requestStateChange();
        storageContext.performAction();

        storageContext.requestStateChange();
        storageContext.performAction();

        storageContext.requestStateChange();
    }
}
