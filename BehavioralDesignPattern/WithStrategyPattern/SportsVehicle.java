package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

import WithStrategyPattern.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends vehicle {
    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}