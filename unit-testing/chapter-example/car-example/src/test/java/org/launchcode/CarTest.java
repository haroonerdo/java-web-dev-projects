package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car test_car;
    @BeforeEach
    public void createCarObject(){
         test_car = new Car("Toyota", "Prius", 10, 50);

    }
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)

    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly

    @Test
    public void testInitialGasTank(){
        //Car test_car = new Car("Toyota", "Prius", 10, 50);
        //assertEquals(10, test_car.getGasTankLevel(), .001);
        //assertFalse(10< test_car.getGasTankLevel());
        assertTrue(10 == test_car.getGasTankLevel());
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public  void testGasTankLevelAfterDriving(){
       test_car.drive(50);
       assertEquals(9, test_car.getGasTankLevel(), .001);
        test_car.drive(400);//Total drive 450 miles
        assertEquals(1, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public  void testGasTankLevelAfterPastTankRange() {
        test_car.drive(501);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }
    //TODO: can't have more gas than tank size, expect an exception
@Test
public void testGasOverLevelException(){

    assertThrows(IllegalArgumentException.class, () -> test_car.addGas(11), "Don't have enough space in the tank for gas");

}

}