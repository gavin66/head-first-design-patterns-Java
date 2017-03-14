package headfirst.command.simpleremote;

/**
 * Created by Gavin on 2017/3/14.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
