package InterviewQuestions.ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingLevel> levels;
    private PaymentService paymentService; 

    public ParkingLot(int numberOfLevels,int smallSpots,int mediumSpots,int largeSpots)
    {
        levels = new ArrayList();
        paymentService = new PaymentService();

        for(int i=0;i<numberOfLevels;i++)
        {
            levels.add(new ParkingLevel(i,smallSpots,mediumSpots,largeSpots));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingLevel level : levels) {
            if (level.parkVehicle(vehicle)) {
                return true;
            }
        }
        System.out.println("No available spot for the vehicle.");
        return false;
    }

    public double leaveVehicle(Vehicle vehicle) {
        for (ParkingLevel level : levels) {
            double cost = level.leaveVehicle(vehicle, paymentService);
            if (cost > 0) return cost;
        }
        System.out.println("Vehicle not found.");
        return 0.0;
    }
}
