package Offline2.Decorator;

public class TwitterNotifier extends BaseDecorator {
    public TwitterNotifier(Notifier notifier){
        super(notifier);
    }

    public void send(){
        System.out.println("Twitter notification on");
        // this.notifier.send();
        if(this.notifier != null){
            this.notifier.send();
        }
    }
}
