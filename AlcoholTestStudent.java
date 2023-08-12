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

public class AlcoholTestStudent {

    @Test
    public void testCalcPriceWithoutWeekendOffer() {
        Alcohol alcohol = new Alcohol("Whiskey", Size.LARGE);
        double expectedPrice = Alcohol.BASE_PRICE + Size.LARGE.getSizePrice();

        Assert.assertEquals(expectedPrice, alcohol.calcPrice(), 0.001);
    }

    @Test
    public void testCalcPriceWithWeekendOffer() {
        Alcohol alcohol = new Alcohol("Vodka", Size.SMALL, true);
        double expectedPrice = Alcohol.BASE_PRICE + Size.SMALL.getSizePrice() + 0.60;

        Assert.assertEquals(expectedPrice, alcohol.calcPrice(), 0.001);
    }

    @Test
    public void testEquals() {
        Alcohol alcohol1 = new Alcohol("Rum", Size.MEDIUM);
        Alcohol alcohol2 = new Alcohol("Rum", Size.MEDIUM);
        Alcohol alcohol3 = new Alcohol("Whiskey", Size.LARGE);

        Assert.assertEquals(alcohol1, alcohol2);
        Assert.assertNotEquals(alcohol1, alcohol3);
    }
} 