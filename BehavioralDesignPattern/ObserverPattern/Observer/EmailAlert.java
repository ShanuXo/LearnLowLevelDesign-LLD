package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlert implements NotificationAlert {
    String emailAddress;
    StocksObservable observable;

    public EmailAlert(String emailAddress, StocksObservable observable) {
        this.emailAddress = emailAddress;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailAddress, "Product is in stock hurry up");
    }

    public void sendMail(String emailAddress, String msg) {
        System.out.println("mail Sent to -> " + emailAddress);
    }

}
