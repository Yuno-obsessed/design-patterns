package sanity.nil.principles.SRP;

public class NotificationService {
    public void notifyUser(Book book) {
        System.out.println("Notification: The book '" + book.getTitle() + "' by " + book.getAuthor() + " is now available.");
    }
}
