package Offline2.Decorator;

public class FacebookNotifier extends BaseDecorator{
    public FacebookNotifier(Notifier notifier){
        super(notifier);
    }

    public void send(){
        System.out.println("Facebook notification on");
        // this.notifier.send();
        if(this.notifier != null){
            this.notifier.send();
        }
    }
}
