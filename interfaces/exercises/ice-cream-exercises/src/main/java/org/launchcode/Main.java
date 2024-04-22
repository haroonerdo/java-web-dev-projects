package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();



        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        System.out.println("** Before **");
        for (Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }

        System.out.println("\n");

        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        flavors.sort(new FlavorComparator());

        System.out.println("** After **");
        for (Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }
        System.out.println("\n");
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        System.out.println("** Before **");
        for(Cone cone: cones) {
            System.out.println(cone.getName()+": "+cone.getCost());
        }

        comparator = new ConeComparator();
        cones.sort(comparator);
        cones.sort(new ConeComparator());

        System.out.println("\n");
        System.out.println("** After **");
        for(Cone cone: cones) {
            System.out.println(cone.getName()+": "+cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
//        for (Flavor flavor: flavors){
//            System.out.println(flavor.getName());
//        }

//        System.out.println("\n");
//
//        for(Cone cone: cones) {
//            System.out.println(cone.getName()+": "+cone.getCost());
//        }
    }
}