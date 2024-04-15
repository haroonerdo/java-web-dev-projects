package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuS {
    private ArrayList<MenuItemS> menuItemS;
    private LocalDate lastUpdated;

    public MenuS() {
        this.menuItemS = new ArrayList<>();;
        this.lastUpdated = LocalDate.now();
    }

    public void printMenu() {
        System.out.println("<<< Menu >>>");
        for (MenuItemS item : menuItemS) {
            System.out.println(item);
        }
        System.out.println("\nLast Updated date: " + this.getLastUpdated() + "\n");
    }


    public void printItem(String string) {
        String wantedItem="This item not exist";
        for (MenuItemS item : this.getMenuItemS()){
           if (item.getName().equalsIgnoreCase(string)){
                wantedItem="Name:        "+item.getName()+
                           "\nDescription: "+item.getDescription()+
                           "\nCategory:    "+item.getCategory()+
                           "\nPrice:       $ "+item.getPrice()+
                           "\nDate Added:  "+item.getDateAdded();
            }
        }
            System.out.println(wantedItem);
    }
    public MenuItemS getItem(String string) {
        for (MenuItemS item : this.getMenuItemS()) {
            if (item.getName().equalsIgnoreCase(string)) {
                return item;
            }
        }
        return null;
    }

    public void addItems(MenuItemS item) {
        if (getItem(item.getName()) != null){

        }else{
            this.menuItemS.add(item);
            this.setLastUpdated(LocalDate.now());
        }
    }

    public void removeItems(MenuItemS item) {
        if (item != null){
            this.menuItemS.remove(item);
            this.setLastUpdated(LocalDate.now());
        }
    }


    public ArrayList<MenuItemS> getMenuItemS() {
        return this.menuItemS;
    }

    public void setMenuItemS(ArrayList<MenuItemS> menuItemS) {
        this.menuItemS = menuItemS;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
