package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class vehicle {
    DriveStrategy object;

    // Constructor injection
    public vehicle(DriveStrategy object) {
        this.object = object;
    }

    public void drive() {
        object.drive();
    }
}
