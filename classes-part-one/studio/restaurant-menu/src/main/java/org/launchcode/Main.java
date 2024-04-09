package org.launchcode;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate; // import the LocalDate class

public class Main {

    public static void main(String[] args) {

        LocalDate myLocalDate = LocalDate.now();
        //DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        Format f = new SimpleDateFormat("MM/dd/yyyy");
        Date date = Date.from(myLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());


        // write your code here
        MenuItem lentilSoup = new MenuItem("Lentil Soup"," ",
                "Appetizer",5.0,  true, date, true);
        MenuItem rice = new MenuItem("Rice"," ",
                "Main Course",3.0,  true,date, true);
        MenuItem trseLeche = new MenuItem("TresLeches"," ",
                "Dessert",5.0,  true,date, true);
        MenuItem salad = new MenuItem("Salad"," ",
                "Salad",5.0,  true,date, true);


        ArrayList<MenuItem> mainMenu = new ArrayList<>();

        Menu myMenu = new Menu(mainMenu);

        myMenu.addItem(lentilSoup);
        myMenu.addItem(rice);
        myMenu.addItem(trseLeche);
        myMenu.addItem(salad);

        myMenu.listMenu();
        myMenu.listByType("Appetizer");
        myMenu.listByType("Main Course");
        myMenu.listByType("Dessert");
        myMenu.listByType("Salad");

    }
}
