package chapter.assignments.Chapter12;

/**
 * Created by 1237jwells on 3/27/2017.
 */
public class Team{
    //Attribute
    private String name;
    public Team () {
        //Attribute name
        this.name = "Jazz";
    }//Converting and Returning attribute
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return this.name;

    }
    public boolean equals(Team that){
        return this.name == that.name;
    }
}
