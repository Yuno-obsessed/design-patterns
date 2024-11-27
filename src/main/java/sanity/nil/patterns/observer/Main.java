package sanity.nil.patterns.observer;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        NotificationSubscriber emailSubscriber = new EmailSubscriber("student1@example.com");
        NotificationSubscriber smsSubscriber = new SMSSubscriber("123-456-7890");

        classroom.addSubscriber(emailSubscriber);
        classroom.addSubscriber(smsSubscriber);

        classroom.sendAnnouncement("Class is starting at 10 AM tomorrow.");

        classroom.removeSubscriber(emailSubscriber);

        classroom.sendAnnouncement("Class has been rescheduled to 11 AM.");
    }
}
