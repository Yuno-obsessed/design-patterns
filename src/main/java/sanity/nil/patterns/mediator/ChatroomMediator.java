package sanity.nil.patterns.mediator;

public interface ChatroomMediator {
    void registerUser(User user);
    void sendMessage(String message, String recipientName, User sender);
}
