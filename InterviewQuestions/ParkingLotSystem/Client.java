package InterviewQuestions.ParkingLotSystem;

import java.lang;
 
public class Client {
    public static void main(String[] args) {
        ParkingLot system =new ParkingLot(1,2,3,4);

        Vehicle bike=new Bike();
        Vehicle car=new Car();
        Vehicle bus=new Bus();

        system.parkVehicle(bike);
        system.parkVehicle(car);
        system.parkVehicle(bus);

        Thread.sleep(2000);

        system.leaveVehicle(bike);
        system.leaveVehicle(car);
        system.leaveVehicle(bus);

    }
}
