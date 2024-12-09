package InterviewQuestions.ParkingLotSystem;

import NullObjectDesignPattern.Vechicle;

public class PaymentService {
    private static final double SMALL_RATE = 10;
    private static final double MEDIUM_RATE = 20;
    private static final double LARGE_RATE = 30;

    public double calculateRate(Vehicle vehicle)
    {
        switch(vehicle.getSize())
        {
            case SMALL:
                return SMALL_RATE;
            case MEDIUM:
                return MEDIUM_RATE;
            case LARGE:
                return LARGE_RATE;
            default:
                return 0;
        }
    }
}
