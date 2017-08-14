package Controller;
import java.util.*;
/**
 * Created by 1237jwells on 6/26/2017.
 */
public class Nest {

    ArrayList<Command> commandsAppliance = new ArrayList<Command>();

    public void register(Command obj) {
        this.commandsAppliance.add(obj);
    }
    public void allOnOff(){
        for(Command c: commandsAppliance){
            c.onOff();
            System.out.println(commandsAppliance);
        }
    }
}