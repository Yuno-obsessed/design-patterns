package sanity.nil.patterns.mediator;

public abstract class User {
    protected String name;
    protected ChatroomMediator chatroom;

    public User(String name, ChatroomMediator chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }

    public abstract void receiveMessage(String message, String senderName);
    public abstract void sendMessage(String message, String recipientName);
}
