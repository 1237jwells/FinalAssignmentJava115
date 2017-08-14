package Controller;

/**
 * Created by 1237jwells on 6/26/2017.
 */
public class Lamp implements Command {
    Boolean onOffToggle=false;
    public void onOff(){
        onOffToggle = !onOffToggle;
        if(onOffToggle)
        System.out.println("Lamp On");
        else
            System.out.println("Lamp Off");
    }
}
