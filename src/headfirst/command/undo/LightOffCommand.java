package headfirst.command.undo;

/**
 * Created by Gavin on 2017/3/14.
 */
public class LightOffCommand implements Command {
    Light light;
    int level;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        level = light.getLevel();
        light.off();
    }

    public void undo() {
        light.dim(level);
    }

}
