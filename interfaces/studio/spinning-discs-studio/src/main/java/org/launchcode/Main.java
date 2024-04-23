package org.launchcode;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("My CD", "CD", 700, 500, "Movie", 5.0);
        DVD myDVD = new DVD("My DVD", "DVD", 4700, 3500, "Movie", 9.5);

        DecimalFormat df=new DecimalFormat("#.##");
        myCD.writeData(myCD.getStoredData());
        myCD.storeData(myCD.getStoredData());
        double fullCD=(100.0*myCD.getStoredData())/myCD.getTotalDiscCapacity();
        String percentCD= df.format(fullCD);
        System.out.println("This CD % "+ percentCD+" full.");
        System.out.println("This CD price: $"+myCD.getPrice());
        myCD.spin();
        System.out.println("Data on CD: " + myCD.readData());

        System.out.println("\n");

        myDVD.writeData(myDVD.getStoredData());
        myDVD.storeData(myDVD.getStoredData());
        double fullDVD=(100.0*myDVD.getStoredData())/myDVD.getTotalDiscCapacity();
        String percentDVD= df.format(fullDVD);
        System.out.println("This DVD % "+ percentDVD+" full.");
        System.out.println("This DVD price: $"+myDVD.getPrice());
        myDVD.spin();
        System.out.println("Data on DVD: " + myDVD.readData());
        // TODO: Call each CD and DVD method to verify that they work as expected.


        List<Optical> opticals =new ArrayList<>();

        opticals.add(new Optical("My CD", "CD", 700, 500, "Movie", 5.0));
        opticals.add(new Optical("First CD", "CD", 700, 630,"Carton", 5.5));
        opticals.add(new Optical("My DVD", "DVD", 4700, 3500,"Western",9.5));
        opticals.add(new Optical("First DVD", "DVD", 4700, 4000,"Documentary",9.0));
        System.out.println("\n bellow part used the List<>.....");
        // i used the new class: Optical
        for(Optical optical: opticals){
            System.out.println("\nName: " + optical.getName());
            System.out.println("Capacity: " + optical.getTotalDiscCapacity() + " MB");
            System.out.println("Contents: " + optical.getContents());
            System.out.println("Disc Type: " + optical.getDiscType());

            optical.writeData(optical.getStoredData());
            optical.storeData(optical.getStoredData());
            double fullOptical=(100.0*optical.getStoredData())/optical.getTotalDiscCapacity();
            String percentOptical= df.format(fullOptical);
            System.out.println("This Disc % "+ percentOptical+" full.");
            System.out.println("This Disc price: $"+optical.getPrice());
            optical.spin();
            System.out.println("Data on disc: " + optical.readData());
        }



    }
}