package org.launchcode.firstTry;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
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
        MenuItem2 lentilSoup = new MenuItem2("Lentil Soup"," ",
                "Appetizer",5.0,  true, date, true);
        MenuItem2 rice = new MenuItem2("Rice"," ",
                "Main Course",3.0,  true,date, true);
        MenuItem2 trseLeche = new MenuItem2("TresLeches"," ",
                "Dessert",5.0,  true,date, true);
        MenuItem2 salad = new MenuItem2("Salad"," ",
                "Salad",5.0,  true,date, true);


        ArrayList<MenuItem2> mainMenu = new ArrayList<>();

        Menu2 myMenu = new Menu2(mainMenu);

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
