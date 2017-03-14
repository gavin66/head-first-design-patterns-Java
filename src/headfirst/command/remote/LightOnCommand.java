package headfirst.command.remote;

/**
 * Created by Gavin on 2017/3/14.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
