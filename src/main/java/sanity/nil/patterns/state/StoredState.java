package sanity.nil.patterns.state;

public class StoredState implements ItemState {
    @Override
    public void handleStateChange(StorageContext context) {
        System.out.println("Transitioning items from Stored to InTransit.");
        context.setState(new InTransitState());
    }

    @Override
    public void performAction() {
        System.out.println("Items are currently in the storage.");
    }
}
