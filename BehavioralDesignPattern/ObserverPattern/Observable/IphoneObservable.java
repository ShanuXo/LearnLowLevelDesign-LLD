package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlert;
import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StocksObservable {

    List<NotificationAlert> itemList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void addItemInStock(NotificationAlert getNotificationAlert) {
        itemList.add(getNotificationAlert);
    }

    @Override
    public void removeItemInStock(NotificationAlert getNotificationAlert) {
        itemList.remove(getNotificationAlert);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlert alert : itemList) {
            alert.update();
        }
    }

    public void setStockCount(int newItemStock) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount = stockCount + newItemStock;
    }

    public int getStockCount() {
        return stockCount;
    }

}
