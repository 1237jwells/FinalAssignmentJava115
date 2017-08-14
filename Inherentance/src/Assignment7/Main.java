package Assignment7;
import java.util.*;
/**
 * Created by 1237jwells on 6/26/2017.
 */
public class Main {
    public static void main(String[] args) {

    }
    public class Bicycle{

// make variable
        public int gear;
        public int speed;
        public int cadence;
// method change variables
        public Bicycle(int startGear, int startSpeed, int startCadence){
            gear = startGear;
            cadence = startCadence;
            speed = startSpeed;
        }
        // Set Variables
        public void setGear(int newvalue){
            gear = newvalue;
        }
        public void setCadence(int newvalue){
            cadence = newvalue;
        }
        public void setSpeed(int decrement){
            speed -= decrement;
        }
        public void setSpeed(int increment){
            speed += increment;
        }

    }

}
