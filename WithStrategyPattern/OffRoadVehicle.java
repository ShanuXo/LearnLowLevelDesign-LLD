package WithStrategyPattern;

import WithStrategyPattern.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends vehicle {

    OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }

}
