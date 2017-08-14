import org.jetbrains.annotations.NotNull;

/**
 * Created by 1237jwells on 6/5/2017.
 */
public class Sicilian extends pizza {
    private String size;
    private String toppings;

    //getters
    public String getsize() {
        return size;
    }

    public String gettoppings() {
        return toppings;
    }

    //setters
    public void setSize(String Size) {
        this.size = Size;
    }

    public void setToppings(String Toppings) {
        this.toppings = Toppings;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}