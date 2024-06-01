package WithCommandDesignPattern.Invoker;

import java.util.Stack;

import WithCommandDesignPattern.Command.ICommand;

public class RemoteControl {
    Stack<ICommand> historyOfCommand = new Stack<>();
    ICommand command;

    public RemoteControl() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        historyOfCommand.add(command);
    }

    public void undo() {
        if (!historyOfCommand.isEmpty()) {
            ICommand lastCommand = historyOfCommand.pop();
            lastCommand.undo();
        }
    }
}
