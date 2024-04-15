package org.launchcode;

import java.time.LocalDate;

public class MenuItemS {
    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;

    public MenuItemS(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();

    }

    public boolean isNew() {
        return !(this.dateAdded.isBefore(LocalDate.now().minusDays((1))));
    }
    @Override
    public String toString() {
        if (this.isNew()) {
            return "**NEW**  $" + getPrice() + "\t" + getName();
        }

        return "$" + getPrice() + "\t" + getName();
    }


//    @Override
//    public boolean equals(MenuItemS menuItemS){
//
//        return (Objects.equals(this, menuItemS));
//    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }



}
