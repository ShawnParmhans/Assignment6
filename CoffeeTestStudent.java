/*
Class: CMSC203 CRN 40398
Program: Assignment 6
Instructor: Farnaz Eivazi
Summary of Description: Beverage Shop
Due Date: 08/07/2023 
Integrity Pledge: I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
Shawn Parmhans
*/

import org.junit.Assert;
import org.junit.Test;

public class CoffeeTestStudent{

    @Test
    public void testCalcPriceWithoutExtras() {
        Coffee coffee = new Coffee("Latte", Size.SMALL, false, false);
        double expectedPrice = Coffee.BASE_PRICE + Size.SMALL.getSizePrice();

        Assert.assertEquals(expectedPrice, coffee.calcPrice(), 0.001);
    }

    @Test
    public void testCalcPriceWithExtraShot() {
        Coffee coffee = new Coffee("Espresso", Size.MEDIUM, true, false);
        double expectedPrice = Coffee.BASE_PRICE + Size.MEDIUM.getSizePrice() + 0.5;

        Assert.assertEquals(expectedPrice, coffee.calcPrice(), 0.001);
    }

    @Test
    public void testCalcPriceWithExtraSyrup() {
        Coffee coffee = new Coffee("Caramel Macchiato", Size.LARGE, false, true);
        double expectedPrice = Coffee.BASE_PRICE + Size.LARGE.getSizePrice() + 0.5;

        Assert.assertEquals(expectedPrice, coffee.calcPrice(), 0.001);
    }

    @Test
    public void testCalcPriceWithBothExtras() {
        Coffee coffee = new Coffee("Mocha", Size.SMALL, true, true);
        double expectedPrice = Coffee.BASE_PRICE + Size.SMALL.getSizePrice() + 1.0;

        Assert.assertEquals(expectedPrice, coffee.calcPrice(), 0.001);
    }

    @Test
    public void testEquals() {
        Coffee coffee1 = new Coffee("Latte", Size.MEDIUM, true, false);
        Coffee coffee2 = new Coffee("Latte", Size.MEDIUM, true, false);
        Coffee coffee3 = new Coffee("Cappuccino", Size.LARGE, false, true);

        Assert.assertEquals(coffee1, coffee2);
        Assert.assertNotEquals(coffee1, coffee3);
    }
}
