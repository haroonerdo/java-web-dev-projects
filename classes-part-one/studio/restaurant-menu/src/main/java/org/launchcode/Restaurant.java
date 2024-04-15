package org.launchcode;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        // create new Items
        MenuItemS chickenSoup=new MenuItemS("Chicken", "With rice",
                5.0, "Appetizer");
        MenuItemS rice = new MenuItemS("Rice","with chicken",
                5.0, "Main Course");
        MenuItemS trseLeche = new MenuItemS("TresLeches","tree kind of milk",
                5.0,"Dessert");
        MenuItemS salad = new MenuItemS("Salad","Vegetable",
                5.0,"Salad");

        // create  menu
        MenuS menuNew = new MenuS();

        //Add items
        menuNew.addItems(chickenSoup);
        menuNew.addItems(rice);
        menuNew.addItems(trseLeche);
        menuNew.addItems(salad);

        // print menu
        menuNew.printMenu();

        // remove item (Salad)
        menuNew.removeItems(salad);

        // print menu again
        menuNew.printMenu();

        // Add new items and print menu
        menuNew.addItems(new MenuItemS("Spaghetti", "Pasta with meatball", 5.0, "Main Course"));
        menuNew.addItems(new MenuItemS("Baklava", "with pistachio", 5.0, "Dessert"));
        menuNew.addItems(new MenuItemS("Lentil", "With tomato paste", 6.0, "mainCourse"));
        menuNew.printMenu();

        // Try to add same item name (Baklava) but not added
        menuNew.addItems(new MenuItemS("Baklava", "with walnut", 5.0, "Dessert"));
        menuNew.printMenu();

        // remove item with name (Spaghetti) and print menu
        menuNew.removeItems(menuNew.getItem("Spaghetti"));
        menuNew.printMenu();


        // conversation customer
        System.out.println("Do you want to see all menu? Y/N");
        Scanner input= new Scanner(System.in);
        String firstInput = input.next();
        if (firstInput.equalsIgnoreCase("Y")){
            menuNew.printMenu();
        }
        else if(firstInput.equalsIgnoreCase("N")){
            System.out.println("Do you want to see any item in the menu? Y/N");
            String secondInput = input.next();
            if(secondInput.equalsIgnoreCase("Y")){
                System.out.println("Which product would you like to see? \n");
                menuNew.printMenu();
                String thridInput = input.next();
                menuNew.printItem(thridInput);
            }else if(secondInput.equalsIgnoreCase("N")){
                System.out.println("Thanks for choosing us");
            }

        }else{
            System.out.println("Invalid input\n Thanks for choosing us");
        }


    }
}
