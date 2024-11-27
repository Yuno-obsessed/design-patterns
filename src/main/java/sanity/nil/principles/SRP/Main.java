package sanity.nil.principles.SRP;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");
        Book book2 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0201616224");

        Inventory inventory = new Inventory();
        inventory.addBook(book1, 3);
        inventory.addBook(book2, 2);

        System.out.println(inventory);

        NotificationService notificationService = new NotificationService();
        notificationService.notifyUser(book1);

        inventory.removeBook(book1, 1);
        System.out.println("After borrowing one copy of 'Clean Code':");
        System.out.println(inventory);

        if (inventory.getStock(book1) > 0) {
            notificationService.notifyUser(book1);
        }
    }
}
