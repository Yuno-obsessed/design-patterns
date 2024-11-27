package sanity.nil.patterns.observer;

public class SMSSubscriber implements NotificationSubscriber {
    private final String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("SMS sent to " + phoneNumber + " with message: " + message);
    }
}