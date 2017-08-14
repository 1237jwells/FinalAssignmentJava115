package chapter.assignments.Chapter12;

/**
 * Created by 1237jwells on 3/27/2017.
 */
public class Television {
    //Attributes
    private String brand;
    private Integer price;
    public Television () {
        //Name Attributes
        this.brand = "Sony";
        this.price = 20;
        //Converting and Returning attributes
    }
    public String getBrand(){
        return this.brand;
    }
    public Integer getPrice(){
        return this.price;
    }
    public void setBrand(String name){
        this.brand = brand;
    }
    public void setPrice(){
        this.price = price;
    }
    public String toString(){
        return this.brand;

    }
    public Integer toInt(){
        return this.price;
    }
    public boolean equals(Television that){
        return this.brand == that.brand;
    }
}
