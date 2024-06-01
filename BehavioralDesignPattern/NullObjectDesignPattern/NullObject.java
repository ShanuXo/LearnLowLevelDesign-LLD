package NullObjectDesignPattern;

public class NullObject implements Vechicle {
    @Override
    public int getFuelTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}
