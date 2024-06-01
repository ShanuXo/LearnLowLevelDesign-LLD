package ObserverPattern;

import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observer.NotificationAlert;
import ObserverPattern.Observer.EmailAlert;
import ObserverPattern.Observer.MobileAlert;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphoneInStock = new IphoneObservable();

        NotificationAlert observer1 = new EmailAlert("Shanusah8001@gmail.com", iphoneInStock);
        NotificationAlert observer2 = new EmailAlert("Siddhantkasyap@gmail.com", iphoneInStock);
        NotificationAlert observer3 = new MobileAlert("9304641125", iphoneInStock);

        iphoneInStock.addItemInStock(observer1);
        iphoneInStock.addItemInStock(observer2);
        iphoneInStock.addItemInStock(observer3);

        iphoneInStock.setStockCount(10);
    }
}
