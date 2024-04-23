package org.launchcode;

public interface OpticalDisc {
/*
They both spin,
They both store data,
Data gets written to the discs by using a laser,
The data on the discs can be read by using a laser,
Once loaded, they both report information like name, capacity, contents, and disc type.
*/

    // Method to spin the disc
    void spin();


    // Method to read data using a laser
    String readData();


}
