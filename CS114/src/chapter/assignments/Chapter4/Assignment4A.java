package chapter.assignments.Chapter4;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.util.Scanner;

/**
 * Created by 1237jwells on 1/20/2017.
 */
public class Assignment4A {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);

        final double PI = 3.14159;
        double radius;
        double length;
        double area;
        double volume;

        System.out.print("Radius = ");
        radius = in.nextDouble();

        System.out.print("Length = ");
        length = in.nextDouble();

        area = (radius * radius) * PI;
        volume = area * length;

        System.out.print("Area = ");
        System.out.println(area);

        System.out.print("volume = ");
        System.out.println(volume);







        //double radius =
        //double Area = radius*radius*pi


        System.out.println();
    }
}
