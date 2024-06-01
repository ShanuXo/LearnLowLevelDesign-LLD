package MediatorDesignPattern;

import MediatorDesignPattern.AuctionDetails.Auction;
import MediatorDesignPattern.AuctionDetails.AuctionMediator;
import MediatorDesignPattern.ColleagueDetails.Colleague;
import MediatorDesignPattern.ColleagueDetails.Bidder;

public class Client {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();

        Colleague bidder1 = new Bidder("Shanu", auctionMediator);
        Colleague bidder2 = new Bidder("Rahul", auctionMediator);

        bidder1.PlaceBid(5000);
        bidder2.PlaceBid(6000);
        bidder1.PlaceBid(7000);
    }
}
