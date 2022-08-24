package ex01;

import java.util.ArrayList;

public class RemoteControl {
    private ArrayList<Command> onCommands;
    private ArrayList<Command> offCommands;

    public RemoteControl() {
        onCommands = new ArrayList<Command>();
        offCommands = new ArrayList<Command>();
    }
    public void setCommand(int idx, Command onCommand, Command offCommand) {
        onCommands.add(idx, onCommand);
        offCommands.add(idx, offCommand);
    }

    public void onButtonWasPushed(int idx) {
        if (onCommands.size() <= idx || idx < 0) {
            System.out.println("Index " + idx + " is invalid!");
            return;
        }
        onCommands.get(idx).execute();
    }
    public void offButtonWasPushed(int idx) {
        if (offCommands.size() <= idx || idx < 0) {
            System.out.println("Index " + idx + " is invalid!");
            return;
        }
        offCommands.get(idx).execute();
    }

    public String toString() {
        return ("Remote Control");
    }
}
