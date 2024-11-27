package sanity.nil.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<NotificationSubscriber> subscribers = new ArrayList<>();

    public void addSubscriber(NotificationSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(NotificationSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String message) {
        for (NotificationSubscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    public void sendAnnouncement(String announcement) {
        System.out.println("Classroom Announcement: " + announcement);
        notifySubscribers(announcement);
    }
}
