package sanity.nil.patterns.observer;

public class EmailSubscriber implements NotificationSubscriber {
    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Email sent to " + email + " with message: " + message);
    }
}
