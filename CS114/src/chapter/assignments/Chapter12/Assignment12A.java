package chapter.assignments.Chapter12;
import java.util.*;
/**
 * Name: Checked Danylo, Jordan Wells
 * Date: 3/26/17
 * Program: Assignment 12A
 * Description: Creating Objects
 * Created by 1237jwells on 3/26/2017.
 */
public class Assignment12A {
    public static void main(String[] args) {
        //Jazz Sports Team
        Team jazz = new Team();
        String t = jazz.toString();
        //Prints Team Name
        System.out.println(t);
        Team cs = new Team();
        //Compares Team Jazz and Team CS
        System.out.println(cs.equals(jazz));
        //Sony Television
        Television hd = new Television();
        String tvBrand = hd.toString();
        Integer tvPrice = hd.toInt();
        //Prints Price and Brand
        System.out.println(tvBrand);
        System.out.println("$"+tvPrice);
        Television notHD = new Television();
        //Compare HD and NotHD
        System.out.println(notHD.equals(hd));
    }




}

