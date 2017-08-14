package Assignment7;

/**
 * Created by 1237jwells on 6/26/2017.
 */
public class Shoes extends footLocker {
    public String blue;
    public String green;
    public String red;
    public String L;
    public String XL;

    Shoes(String Color, String Size) {
        super(Color, Size);
    }

    public void Color(String newBlue,String newGreen,String newRed){
        blue = newBlue;
        green = newGreen;
        red = newRed;
    }

    public void Size(String newL,String newXL){
        L = newL;
        XL = newXL;
    }
}
