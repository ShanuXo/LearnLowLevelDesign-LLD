package MediatorDesignPattern.AuctionDetails;

import MediatorDesignPattern.ColleagueDetails.Colleague;
import java.util.List;

import java.util.ArrayList;

public class Auction implements AuctionMediator {
    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void AddBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void PlaceBid(Colleague bidder, int bidAmount) {
        for (Colleague colleague : colleagues) {
            if (!colleague.getName().equals(bidder.getName())) {
                colleague.ReceiveBidNotification(bidAmount);
            }
        }
    }

}
