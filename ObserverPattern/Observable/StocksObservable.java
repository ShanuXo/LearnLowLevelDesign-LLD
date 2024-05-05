package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlert;

public interface StocksObservable {

    public void addItemInStock(NotificationAlert getNotificationAlert);

    public void removeItemInStock(NotificationAlert getNotificationAlert);

    public void notifySubscribers();

    public void setStockCount(int newItemStock);

    public int getStockCount();
}
