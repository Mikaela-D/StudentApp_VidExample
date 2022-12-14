package atu.ie;

import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args) {
        //Created first instance of Rectangle
        System.out.println("\nPlease enter the length of the rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        Rectangle shapeRect = new Rectangle();
        shapeRect.setLength(length);
        System.out.println("You entered : " + shapeRect.getLength());


        System.out.println("Please enter the width of the rectangle");
        double width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.println("You entered : " + shapeRect.getWidth());

        //Created second instance of Rectangle
        Rectangle shapeRect2 = new Rectangle();
        System.out.println("\nPlease enter the second length of the rectangle");
        double length2 = input.nextDouble();
        shapeRect2.setLength(length2);
        System.out.println("You entered : " + shapeRect2.getLength());

        System.out.println("Please enter the width of the rectangle");
        double width2 = input.nextDouble();
        shapeRect2.setWidth(width2);
        System.out.println("You entered : " + shapeRect2.getWidth());

        Rectangle shapeRect3 =new Rectangle(23, 67);
        System.out.println("You entered for length: " + shapeRect3.getLength());
        System.out.println("You entered for width: " + shapeRect3.getWidth());
    }
}
