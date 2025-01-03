package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        // vehicle vh = new GoodsVehicle();
        // vehicle vh = new SportsVehicle();
        vehicle vh = new PassengerVehicle();
        vehicle vh2 = new SportsVehicle();
        vh2.drive();
        vh.drive();
    }
}
