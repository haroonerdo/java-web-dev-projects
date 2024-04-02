package org.launchcode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Double fahrenheit;
        Double celsius;
        String kind;
        String kindTemperature;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter kind of the temperature(f or c): ");
        kind=input.next();
        if (kind.equals("f")){
            kindTemperature= "fahrenheit";
            System.out.println("Enter the temperature in " +kindTemperature+": ");
            fahrenheit = input.nextDouble();
            celsius = (fahrenheit - 32) * 5/9;
            System.out.println("The temperature in Celsius is: " + celsius + "°C");
        }else if(kind.equals("c")){
            kindTemperature= "celsius";
            System.out.println("Enter the temperature in " +kindTemperature+": ");
            celsius = input.nextDouble();
            fahrenheit =(celsius*9/5)+32;
            System.out.println("The temperature in Celsius is: " + fahrenheit + "°F");
        }else{
            System.out.println("Your input is not accepted");
        }
        input.close();

    }
}
