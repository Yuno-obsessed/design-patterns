package sanity.nil.patterns.command;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanStart = new FanStartCommand(fan);
        Command fanStop = new FanStopCommand(fan);

        RemoteControl remoteControl = new RemoteControl();

        System.out.println("Executing Commands...");
        remoteControl.pressButton(lightOn);
        remoteControl.pressButton(fanStart);

        System.out.println("\nUndoing Commands...");
        remoteControl.pressUndo();
        remoteControl.pressUndo();

        System.out.println("\nTurning off light...");
        remoteControl.pressButton(lightOff);

        System.out.println("\nUndo light off...");
        remoteControl.pressUndo();
    }
}
