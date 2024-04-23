package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, String discType, int totalDiscCapacity, int storedData, String contents, double price) {
        super(name, discType, totalDiscCapacity, storedData, contents, price);
    }

    @Override
    public void storeData(int data) {
        if (data <=getTotalDiscCapacity()) {
            System.out.println("Data stored successfully.");
        } else {
            System.out.println("Error: Data stored unsuccessfully!");
        }
    }

    @Override
    public void writeData(int data) {
        if (getStoredData() <= getTotalDiscCapacity()) {
            System.out.println("Data successfully saved to disc.");
        } else {
            System.out.println("Error: Data exceeds disc capacity!");
        }
    }

    @Override
    public void spin() {
        System.out.println("DVD is spinning.");
    }

    @Override
    public String readData() {
        return "Reading data from Dvd.";
    }


}
