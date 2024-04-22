package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        System.out.println(flavors);
        System.out.println("\n");

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
//        System.out.println(flavors);
//        System.out.println("\n");
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        flavors.sort(new FlavorComparator());
        //System.out.println(flavors);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
//        System.out.println(cones);
//        System.out.println("\n");
         comparator = new ConeComparator();
        cones.sort(comparator);
        cones.sort(new ConeComparator());
        //System.out.println(cones);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println(flavors);
        System.out.println("\n");
        System.out.println(cones);
    }
}