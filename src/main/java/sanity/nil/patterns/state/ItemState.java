package sanity.nil.patterns.state;

public interface ItemState {
    void handleStateChange(StorageContext context);
    void performAction();
}
