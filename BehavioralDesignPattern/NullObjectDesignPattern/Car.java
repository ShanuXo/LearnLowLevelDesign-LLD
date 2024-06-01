package NullObjectDesignPattern;

public class Car implements Vechicle {
    @Override
    public int getFuelTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 6;
    }
}
