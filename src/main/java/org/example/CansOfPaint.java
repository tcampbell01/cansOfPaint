import java.util.Scanner;
import java.lang.Math;

public class CansOfPaint {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */

        double base = 0;
        double height = 0;
        double cansOfPaint = 0;

        //one can of paint covers 50 square inches of the triangle
        //the area of a triangle is 1/2 the base times the height

        System.out.print("Enter the base of the triangle: ");
        base = scnr.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        height = scnr.nextDouble();

        cansOfPaint = Math.ceil((base * height) / 2.0) / 50;

        System.out.println("You will need " + cansOfPaint + " cans of paint.");

    }
}