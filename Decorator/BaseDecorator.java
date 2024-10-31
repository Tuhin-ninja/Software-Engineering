package Offline2.Decorator;

public abstract class BaseDecorator implements Notifier{
    Notifier notifier;
    public BaseDecorator(Notifier notifier){
        this.notifier = notifier;
    }
}
