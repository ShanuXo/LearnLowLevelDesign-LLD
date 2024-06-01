package WithoutCommandDesignPattern;

import WithoutCommandDesignPattern.AirConditioner;

public class Main {
     public static void main(String[] args) {
          AirConditioner air = new AirConditioner();
          air.isTurnOn();
          air.setTemperature(18);
          air.isTurnOff();
     }
}
