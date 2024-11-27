package sanity.nil.patterns.state;

public class StorageContext {
    private ItemState currentState;

    public StorageContext() {
        this.currentState = new StoredState();
    }

    public void setState(ItemState state) {
        this.currentState = state;
    }

    public void requestStateChange() {
        currentState.handleStateChange(this);
    }

    public void performAction() {
        currentState.performAction();
    }
}
