package Java.DesignPatterns.StructuralPattern;

class Notifier{
    void sendMessage(String message){
        // Send EMAIL
    }
}

abstract class BaseDecorator extends Notifier{

    Notifier notifier;

    BaseDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void sendMessage(String message) {
        // Send EMAIL
    }
}

class SMSDecorator extends BaseDecorator{

    SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        sendSMS(message);
    }

    void sendSMS(String message){
        // SEND SMS
    }
}

class FacebookDecorator extends BaseDecorator{

    FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        sendFacebook(message);
    }

    void sendFacebook(String message){
        // SEND FACEBOOK
    }
}

public class DecoratorMethod {
    public static void main(String[] args){
        Notifier notifier = new Notifier();
        notifier = new SMSDecorator(notifier);
        notifier = new FacebookDecorator(notifier);
        notifier.sendMessage("Hello");
    }


}
