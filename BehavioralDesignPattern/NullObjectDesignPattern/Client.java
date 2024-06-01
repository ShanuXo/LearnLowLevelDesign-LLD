package NullObjectDesignPattern;

public class Client {
    public static void main(String[] args) {
        Vechicle vehicle = VechicleFactory.getVechicleObject("Car");
        getVehicleDetails(vehicle);
    }

    public static void getVehicleDetails(Vechicle vehicle) {
        System.out.println("Seating Capacity : " + vehicle.getSeatingCapacity());
        System.out.println("Seating Capacity : " + vehicle.getFuelTankCapacity());
    }
}
