package WithCommandDesignPattern;

import java.util.concurrent.atomic.AtomicInteger;

import WithCommandDesignPattern.Command.TurnOnAcCommand;
import WithCommandDesignPattern.Invoker.RemoteControl;
import WithCommandDesignPattern.Receiver.AirConditioner;

public class Client {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        RemoteControl clientControl = new RemoteControl();

        clientControl.setCommand(new TurnOnAcCommand(ac));
        clientControl.pressButton();

        clientControl.undo();
    }
}
