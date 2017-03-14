package headfirst.command.remote;

/**
 * Created by Gavin on 2017/3/14.
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    @Override
    public void execute() {
        garageDoor.up();
    }

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
}
