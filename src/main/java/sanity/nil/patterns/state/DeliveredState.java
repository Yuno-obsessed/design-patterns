package sanity.nil.patterns.state;

public class DeliveredState implements ItemState {
    @Override
    public void handleStateChange(StorageContext context) {
        System.out.println("Items are already delivered. No further transitions possible.");
    }

    @Override
    public void performAction() {
        System.out.println("Items have been delivered to the destination.");
    }
}
