package org.launchcode;

public class MenuItem1 {

    private String description;
    private String category;
    private double price;
    private boolean newItem;
    private String availableDate;



    public MenuItem1(String description, String category, double price, boolean newItem, String availableDate) {
        this.description = description;
        this.category = category;
        this.price = price;
        this.newItem = newItem;
        this.availableDate=availableDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    public String getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }
}
