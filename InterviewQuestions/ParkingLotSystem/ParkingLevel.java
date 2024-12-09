package InterviewQuestions.ParkingLotSystem;

import java.util.ArrayList<Integer>;
import java.util.List;


public class ParkingLevel {
    private int levelId;
    private List<ParkingSpot> spots;

    public ParkingLevel(int levelId,int smallCount,int mediumCount,int largeCount)
    {
        this.levelId = levelId;
        this.spots = new ArrayList<>();

        for(int i=0;i<smallCount;i++)
        {
            spots.add(new ParkingSpot(Size.SMALL));
        }
        for(int i=0;i<mediumCount;i++)
        {
            spots.add(new ParkingSpot(Size.MEDIUM));
        }
        for(int i=0;i<largeCount;i++)
        {
            spots.add(new ParkingSpot(Size.LARGE));
        }
    }

    public boolean parkVehicle(Vehicle vehicle)
    {
        for(ParkingSpot spot : spots)
        {
            if(spot.park(vehicle))
            {
                System.out.println("Vehicle Parked on the level "+levelId);
                return true;
            }
        }
        return false;
    }

    public double leaveVehicle(Vehicle vehicle,PaymentService paymentService)
    {
        for(ParkingSpot spot : spots)
        {
            if(!spot.isAvailable() && spot.canFitVehicle(vehicle))
            {
                double rate = paymentService.calculateRate(vehicle);
                double cost = spot.leave(rate);
                System.out.println("Vehicle removed from level " + levelId + ". Cost: $" + cost);
                return cost;
            }
        }
        return 0.0;
    }
}
