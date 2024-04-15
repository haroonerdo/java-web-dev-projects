package org.launchcode;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu1 {
    public static void main(String[] args) {

        ArrayList<MenuItem1> myMenu = new ArrayList<>();
        ArrayList<MenuItem1> appetizers = new ArrayList<>();
        ArrayList<MenuItem1> mainCourses = new ArrayList<>();
        ArrayList<MenuItem1> desserts = new ArrayList<>();

        Scanner input=new Scanner(System.in);
        SimpleDateFormat availableDate=new SimpleDateFormat("MM-dd-yyyy");
        //String availableDate=input.nextLine();



        MenuItem1 lentilSoup = new MenuItem1("Lentil Soup", "Appetizer",5.0,  true,"04-01-2024");
        myMenu.add(lentilSoup);
        appetizers.add(lentilSoup);

        MenuItem1 rice = new MenuItem1("Rice", "Main Course", 2.0, false, "01-01-2000");
        myMenu.add(rice);
        mainCourses.add(rice);

        MenuItem1 chicken = new MenuItem1("Chicken", "Main Course",7.0,  false,"01-01-2000");
        myMenu.add(chicken);
        mainCourses.add(chicken);

        MenuItem1 trilece = new MenuItem1("TresLeches", "Dessert", 15.0, true,"04-01-2024");
        myMenu.add(trilece);
        desserts.add(trilece);

        MenuItem1 pasta =new MenuItem1("Lasagna", "Main Course", 8.0, false,"01-01-2000");
        myMenu.add(pasta);
        mainCourses.add(pasta);


        for(MenuItem1 items : myMenu) {
            if(items.isNewItem()){
            System.out.println("New => "+items.getDescription() +", "+ items.getCategory()+" $"+items.getPrice()+" available from "+items.getAvailableDate());
            }else {
                System.out.println("Traditional => "+items.getDescription()+", "+ items.getCategory()+" $"+items.getPrice()+" available from "+items.getAvailableDate());
            }
        }

        // use the setter
        pasta.setPrice(11.0);
        rice.setPrice(7.0);

        System.out.println("\nMenu");
        System.out.println("\nAppetizers");
        for(MenuItem1 menu : appetizers ){
            System.out.println(menu.getDescription()+": $"+menu.getPrice());
        }
        System.out.println("\nMain Courses");
        for(MenuItem1 menu : mainCourses ){
            System.out.println(menu.getDescription()+": $"+menu.getPrice());
        }
        System.out.println("\nDesserts");
        for(MenuItem1 menu : desserts ){
            System.out.println(menu.getDescription()+": $"+menu.getPrice());
        }



    }

}
