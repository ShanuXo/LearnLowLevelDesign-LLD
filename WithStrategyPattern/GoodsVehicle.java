package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends vehicle {

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }

}
