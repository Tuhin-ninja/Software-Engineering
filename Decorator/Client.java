package Offline2.Decorator;

public class Client {
    public static void main(String[] args) {
        Notifier facebookNotifier = new FacebookNotifier(null);
        // facebookNotifier.send();

        Notifier twitterNotifier = new TwitterNotifier(facebookNotifier);
        twitterNotifier.send();
    }
}
