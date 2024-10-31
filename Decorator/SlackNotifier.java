package Offline2.Decorator;

public class SlackNotifier extends BaseDecorator {
    public SlackNotifier(Notifier notifier){
        super(notifier);
    }

    public void send(){
        System.out.println("Slack notification on");
        // this.notifier.send();
        if(this.notifier != null){
            this.notifier.send();
        }
    }
}
