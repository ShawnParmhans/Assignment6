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

public class BevShopDriverApp
{
    public static void main(String[] args) {
        BevShop bevShop = new BevShop();

        // Create a customer
        Customer customer1 = new Customer("John", 23);
        Customer customer2 = new Customer("Ray", 18);

        // Start a new order for customer1
        bevShop.startNewOrder(1, Day.TUESDAY, "Jojo", 26);

        // Add alcoholic beverages to customer1's order
        bevShop.getCurrentOrder().addNewBeverage("Beer", Size.MEDIUM);
        bevShop.getCurrentOrder().addNewBeverage("Wine", Size.SMALL);
        bevShop.getCurrentOrder().addNewBeverage("Whiskey", Size.LARGE);

        // Display current order details for customer1
        System.out.println("Current Order:");
        System.out.println(bevShop.getCurrentOrder());

        // Start a new order for customer2
        bevShop.startNewOrder(9, Day.SATURDAY, "Larry", 18);

        // Add non-alcoholic beverages to customer2's order
        bevShop.getCurrentOrder().addNewBeverage("Smoothie", Size.LARGE, 3, false);
        bevShop.getCurrentOrder().addNewBeverage("Coffee", Size.SMALL);

        // Display current order details for customer2
        System.out.println("Current Order:");
        System.out.println(bevShop.getCurrentOrder());

        // Calculate and display the total monthly sale
        System.out.println("Total Monthly Sale: $" + bevShop.totalMonthlySale());
    }
}