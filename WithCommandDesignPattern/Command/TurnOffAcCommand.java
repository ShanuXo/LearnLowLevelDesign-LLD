package WithCommandDesignPattern.Command;

import WithCommandDesignPattern.Receiver.AirConditioner;

public class TurnOffAcCommand implements ICommand {

    AirConditioner ac;

    public TurnOffAcCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.TurnOff();
    }

    @Override
    public void undo() {
        ac.TurnOn();
    }
}
