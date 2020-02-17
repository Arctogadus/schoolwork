package lecture;

import java.util.Scanner;

public class CircleMain {
    private static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        double radius;
        Circle circle = new Circle();

        System.out.print("Please enter the radius of a circle: ");
        radius = scnr.nextDouble();

        circle.setRadius(6.2);
        System.out.println(circle.getRadius());
        System.out.println(circle.calcArea());
        System.out.println(circle.calcCircumference());

        System.out.println(circle);
        System.out.println(scnr);
    }
}
