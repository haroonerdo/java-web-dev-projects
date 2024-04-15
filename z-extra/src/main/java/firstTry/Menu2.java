package org.launchcode.firstTry;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Menu2 {

    Format f = new SimpleDateFormat("MM/dd/yyyy");

//    private ArrayList<ArrayList<MenuItem>> menu = new ArrayList<>();
//    private ArrayList<MenuItem> appetizers = new ArrayList<>();
//    private ArrayList<MenuItem> mainCourses = new ArrayList<>();
//    private ArrayList<MenuItem> desserts = new ArrayList<>();
//    private ArrayList<MenuItem> miscellaneous = new ArrayList<>();


    private ArrayList<MenuItem2> menu = new ArrayList<>();

//    public Menu(ArrayList<ArrayList<MenuItem>> menu, ArrayList<MenuItem> appetizers, ArrayList<MenuItem> mainCourses, ArrayList<MenuItem> desserts, ArrayList<MenuItem> miscellaneous) {
//        this.menu = menu;
//        this.appetizers = appetizers;
//        this.mainCourses = mainCourses;
//        this.desserts = desserts;
//        this.miscellaneous = miscellaneous;
//    }


    public Menu2(ArrayList<MenuItem2> menu) {
        this.menu = menu;
    }

    public ArrayList<MenuItem2> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem2> menu) {
        this.menu = menu;
    }


    public void addItem(MenuItem2 item) {
        getMenu().add(item);
    }

    public void listMenu() {
        for (MenuItem2 item : getMenu()){
            System.out.println(item.getName()+", $"+item.getPrice()+", Category: "+item.getCategory());
        }
        System.out.println("\n");
    }

    public void listByType(String string){
        for (MenuItem2 item : getMenu()){
            if (item.getCategory().equals(string)){
                System.out.println(item.getName()+", Updated "+f.format(item.getAddedDate()));
            }
        }
    }
}
