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
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent {

    private BevShop bevShop;

    @Before
    public void setup() {
        bevShop = new BevShop();
    }

    @Test
    public void testIsValidTime() {
        Assert.assertTrue(bevShop.isValidTime(8));
        Assert.assertTrue(bevShop.isValidTime(15));
        Assert.assertTrue(bevShop.isValidTime(23));

        Assert.assertFalse(bevShop.isValidTime(7));
        Assert.assertFalse(bevShop.isValidTime(24));
    }

    @Test
    public void testGetMaxNumOfFruits() {
        Assert.assertEquals(5, bevShop.getMaxNumOfFruits());
    }

    @Test
    public void testGetMinAgeForAlcohol() {
        Assert.assertEquals(18, bevShop.getMinAgeForAlcohol());
    }

    @Test
    public void testIsMaxFruit() {
        Assert.assertFalse(bevShop.isMaxFruit(3));
        Assert.assertFalse(bevShop.isMaxFruit(5));

        Assert.assertTrue(bevShop.isMaxFruit(6));
        Assert.assertTrue(bevShop.isMaxFruit(10));
    }

    @Test
    public void testGetMaxOrderForAlcohol() {
        Assert.assertEquals(3, bevShop.getMaxOrderForAlcohol());
    }

    @Test
    public void testIsEligibleForMore() {
        bevShop.processAlcoholOrder("Whiskey", Size.SMALL);
        bevShop.processAlcoholOrder("Vodka", Size.MEDIUM);

        Assert.assertTrue(bevShop.isEligibleForMore());

        bevShop.processAlcoholOrder("Rum", Size.LARGE);

        Assert.assertTrue(bevShop.isEligibleForMore());
    }

    @Test
    public void testGetNumOfAlcoholDrink() {
        bevShop.processAlcoholOrder("Whiskey", Size.SMALL);
        bevShop.processAlcoholOrder("Vodka", Size.MEDIUM);

        Assert.assertEquals(0, bevShop.getNumOfAlcoholDrink());
    }

    @Test
    public void testIsValidAge() {
        Assert.assertTrue(bevShop.isValidAge(21));
        Assert.assertTrue(bevShop.isValidAge(18));

        Assert.assertFalse(bevShop.isValidAge(17));
        Assert.assertFalse(bevShop.isValidAge(15));
    }

    @Test
    public void testStartNewOrder() {
        bevShop.startNewOrder(10, Day.MONDAY, "John Doe", 25);

        Assert.assertEquals(1, bevShop.totalNumOfMonthlyOrders());
        Assert.assertEquals("John Doe", bevShop.getCurrentOrder().getCustomer().getName());
    }


}