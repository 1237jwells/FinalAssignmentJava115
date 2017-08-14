import java.util.Comparator;

/**
 * Created by 1237jwells on 6/5/2017.
 */
import java.util.Scanner;
public class pizzaOrderingApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String type;
        String size;
        String toppings;


        System.out.println("What is your name: ");
        name = input.next();

        System.out.print("What type of pizza you want brotha: \n");
        type = input.next();

        System.out.print("What size you want bro: ");
        size = input.next();

        System.out.print("Choose some toppings Dude: ");
        toppings = input.next();

        System.out.printf(name + type + size + toppings);
    }


}
