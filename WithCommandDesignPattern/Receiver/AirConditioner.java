package WithCommandDesignPattern.Receiver;

public class AirConditioner {
    boolean isOn;
    int temp;

    public void TurnOn() {
        isOn = true;
        System.out.println("Air Conditioner is turned On");
    }

    public void TurnOff() {
        isOn = false;
        System.out.println("Air Conditioner is turned off");
    }

    public void setTemperature(int temperature) {
        this.temp = temperature;
        System.out.println("Temperature is :" + temp);
    }
}
