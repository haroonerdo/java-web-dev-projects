package org.launchcode;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {

    private Format dateFormat = new SimpleDateFormat();

    private String name;
    private String description;
    private String category;
    private double price;
    private boolean newItem;
    private Date addedDate;
    private boolean available;

    public MenuItem(String name, String description, String category, double price, boolean newItem, Date addedDate, boolean available) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newItem = newItem;
        this.addedDate = addedDate;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
