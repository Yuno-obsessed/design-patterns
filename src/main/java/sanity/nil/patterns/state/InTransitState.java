package sanity.nil.patterns.state;

public class InTransitState implements ItemState {
    @Override
    public void handleStateChange(StorageContext context) {
        System.out.println("Transitioning items from InTransit to Delivered.");
        context.setState(new DeliveredState());
    }

    @Override
    public void performAction() {
        System.out.println("Items are currently being transported.");
    }
}
