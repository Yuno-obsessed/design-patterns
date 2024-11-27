package sanity.nil.patterns.mediator;

import java.util.HashMap;
import java.util.Map;

public class Chatroom implements ChatroomMediator {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void registerUser(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public void sendMessage(String message, String recipientName, User sender) {
        User recipient = users.get(recipientName);
        if (recipient != null) {
            recipient.receiveMessage(message, sender.getName());
        } else {
            System.out.println("User " + recipientName + " is not registered in the chatroom.");
        }
    }
}