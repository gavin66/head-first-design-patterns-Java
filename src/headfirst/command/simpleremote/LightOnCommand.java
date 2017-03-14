package headfirst.command.simpleremote;

/**
 * Created by Gavin on 2017/3/14.
 */
public class LightOnCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.on();
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }
}
