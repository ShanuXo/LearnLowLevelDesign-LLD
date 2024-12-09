package InterviewQuestions.ParkingLotSystem;

import java.time.Duration;
import java.time.LocalDateTime;


public class ParkingSpot {
    private Size spotSize;
    private Vehicle currentVehicle;
    private LocalDateTime entryTime;

    public ParkingSpot(Size spotSize)
    {
        this.spotSize = spotSize;
        this.currentVehicle = null;
        this.entryTime= null;
    }
     
    public boolean isAvailable()
    {
        return currentVehicle==null;
    }

    public boolean canFitVehicle(Vehicle vehicle)
    {
        return currentVehicle==null && vehicle.getSize().ordinal() <= spotSize.ordinal();
    }

    public boolean park(Vehicle vehicle)
    {
        if(canFitVehicle(vehicle))
        {
            this.currentVehicle = vehicle;
            this.entryTime = LocalDateTime.now();
            return true;
        }
        return false;
    }

    public double leave(double hourlyRate)
    {
        if(currentVehicle==null && entryTime == null)
        {
            return 0.0;
        }
        LocalDateTime exitTime = LocalDateTime.now();
        Duration duration = Duration.between(entryTime,exitTime);
        long hours = Math.max(1, duration.toHours());
        double cost = hourlyRate * hours;

        //Reset the spot
        this.entryTime = null;
        this.currentVehicle = null;

        return cost;
    }
    
}
