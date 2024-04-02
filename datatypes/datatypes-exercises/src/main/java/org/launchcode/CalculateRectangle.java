package org.launchcode;
import java.util.Scanner;

public class CalculateRectangle {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a side of the rectangle: ");
        double a= input.nextDouble();

        System.out.println("Please, enter another side of the rectangle: ");
        double b= input.nextDouble();

        double area=a*b;
        System.out.println("The area of the rectangle: " + area);

        double perimeter=((2*a)+(2*b));
        System.out.println("The perimeter of the rectangle: " + perimeter);

    }
}
