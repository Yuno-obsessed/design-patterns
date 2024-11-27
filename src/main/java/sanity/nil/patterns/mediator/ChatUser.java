package sanity.nil.patterns.mediator;

public class ChatUser extends User {

    public ChatUser(String name, ChatroomMediator chatroom) {
        super(name, chatroom);
    }

    @Override
    public void receiveMessage(String message, String senderName) {
        System.out.println(name + " received a message from " + senderName + ": " + message);
    }

    @Override
    public void sendMessage(String message, String recipientName) {
        System.out.println(name + " is sending a message to " + recipientName + ": " + message);
        chatroom.sendMessage(message, recipientName, this);
    }
}
