package MediatorDesignPattern.ColleagueDetails;

public interface Colleague {
    void PlaceBid(int bidAmount);

    void ReceiveBidNotification(int bidAmount);

    String getName();
}