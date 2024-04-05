package org.launchcode;

import java.util.Scanner;

public class Circle {

    public static Double getArea() {

        Scanner input = new Scanner(System.in);
        double radius;

        do {
            System.out.print("Please enter the radius of the circle: ");
            while (!input.hasNextDouble()){
                System.out.print("Error. Please enter a positive number: ");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);
        return (3.14* radius * radius);
    }
}

