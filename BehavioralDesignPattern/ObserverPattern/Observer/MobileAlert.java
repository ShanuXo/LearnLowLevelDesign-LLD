package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlert implements NotificationAlert {
    String userMobileNumber;
    StocksObservable observable;

    public MobileAlert(String userMobileNumber, StocksObservable observable) {
        this.userMobileNumber = userMobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userMobileNumber, "Product is in stock hurry up");
    }

    public void sendMsgOnMobile(String userMobileNumber, String msg) {
        System.out.println("sms Sent to -> " + userMobileNumber);
    }
}
