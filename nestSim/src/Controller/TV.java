package Controller;

/**
 * Created by 1237jwells on 6/26/2017.
 */
public class TV implements Command{
    Boolean Toggle=false;
    public void onOff(){
        Toggle = !Toggle;
        if(Toggle)
            System.out.println("TV On");
        else
            System.out.println("TV Off");
    }
}
