package sanity.nil.patterns.command;

import java.util.Stack;

public class RemoteControl {
    private Stack<Command> commandHistory = new Stack<>();

    public void pressButton(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo");
        }
    }
}
