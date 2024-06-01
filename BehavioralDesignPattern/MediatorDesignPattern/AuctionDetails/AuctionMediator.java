package MediatorDesignPattern.AuctionDetails;

import MediatorDesignPattern.ColleagueDetails.Colleague;

public interface AuctionMediator {
    void AddBidder(Colleague bidder);

    void PlaceBid(Colleague bidder, int bidAmount);
}
