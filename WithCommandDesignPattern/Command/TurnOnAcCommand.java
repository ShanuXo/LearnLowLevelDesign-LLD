package WithCommandDesignPattern.Command;

import WithCommandDesignPattern.Receiver.AirConditioner;

public class TurnOnAcCommand implements ICommand {

    AirConditioner ac;

    public TurnOnAcCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.TurnOn();
    }

    @Override
    public void undo() {
        ac.TurnOff();
    }
}
