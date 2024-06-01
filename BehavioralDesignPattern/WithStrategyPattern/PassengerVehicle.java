package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends vehicle {

    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }

}
