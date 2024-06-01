package WithoutCommandDesignPattern;

public class AirConditioner {
    int temperature;
    boolean isOn;

    public void isTurnOn() {
        isOn = true;
        System.out.println("Air Conditioner is turned on");
    }

    public void isTurnOff() {
        isOn = false;
        System.out.println("Air Conditoner is turned off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature is : " + temperature);
    }

}
