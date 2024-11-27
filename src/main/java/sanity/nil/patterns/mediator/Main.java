package sanity.nil.patterns.mediator;

public class Main {
    public static void main(String[] args) {
        ChatroomMediator chatroom = new Chatroom();

        User alice = new ChatUser("Alice", chatroom);
        User bob = new ChatUser("Bob", chatroom);
        User charlie = new ChatUser("Charlie", chatroom);

        chatroom.registerUser(alice);
        chatroom.registerUser(bob);
        chatroom.registerUser(charlie);

        alice.sendMessage("Hi Bob!", "Bob");
        bob.sendMessage("Hello Alice! How are you?", "Alice");
        charlie.sendMessage("Hi everyone!", "Alice");
        alice.sendMessage("Hi Charlie! Welcome!", "Charlie");
    }
}
