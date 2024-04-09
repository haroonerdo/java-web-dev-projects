package org.launchcode;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Menu {

    Format f = new SimpleDateFormat("MM/dd/yyyy");

//    private ArrayList<ArrayList<MenuItem>> menu = new ArrayList<>();
//    private ArrayList<MenuItem> appetizers = new ArrayList<>();
//    private ArrayList<MenuItem> mainCourses = new ArrayList<>();
//    private ArrayList<MenuItem> desserts = new ArrayList<>();
//    private ArrayList<MenuItem> miscellaneous = new ArrayList<>();


    private ArrayList<MenuItem> menu = new ArrayList<>();

//    public Menu(ArrayList<ArrayList<MenuItem>> menu, ArrayList<MenuItem> appetizers, ArrayList<MenuItem> mainCourses, ArrayList<MenuItem> desserts, ArrayList<MenuItem> miscellaneous) {
//        this.menu = menu;
//        this.appetizers = appetizers;
//        this.mainCourses = mainCourses;
//        this.desserts = desserts;
//        this.miscellaneous = miscellaneous;
//    }


    public Menu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }


    public void addItem(MenuItem item) {
        getMenu().add(item);
    }

    public void listMenu() {
        for (MenuItem item : getMenu()){
            System.out.println(item.getName()+", $"+item.getPrice()+", Category: "+item.getCategory());
        }
        System.out.println("\n");
    }

    public void listByType(String string){
        for (MenuItem item : getMenu()){
            if (item.getCategory().equals(string)){
                System.out.println(item.getName()+", Updated "+f.format(item.getAddedDate()));
            }
        }
    }
}
