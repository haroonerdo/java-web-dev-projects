package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private String discType;
    private int totalDiscCapacity;
    private int  storedData;
    private String contents;
    private double price;

    public BaseDisc(String name, String discType, int totalDiscCapacity, int storedData, String contents, double price) {
        this.name = name;
        this.discType = discType;
        this.totalDiscCapacity = totalDiscCapacity;
        this.storedData = storedData;
        this.contents = contents;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getTotalDiscCapacity() {
        return totalDiscCapacity;
    }

    public void setTotalDiscCapacity(int totalDiscCapacity) {
        this.totalDiscCapacity = totalDiscCapacity;
    }

    public int getStoredData() {
        return storedData;
    }

    public void setStoredData(int storedData) {
        this.storedData = storedData;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Store Data Method
    public void storeData( int data) {

    }

    public void writeData(int data){

    }


}
