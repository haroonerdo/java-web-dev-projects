package org.launchcode;

import java.util.Scanner;

import static org.launchcode.Circle.getArea;


public class Area {
    public static void main(String[] args){


        double message= getArea();
        double msg= Math.sqrt(message/3.14);
        System.out.println("The area of a circle of radius "+msg+ " is "+message);
    }
}
