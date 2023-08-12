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

import java.util.ArrayList;
import java.util.List;


public class BevShop implements BevShopInterface 
{
	private Order[] orders;
	private int numOrders;
	
    private final int maxNumOfFruits = 5;
    private final int minAgeForAlcohol = 18;
    private final int maxOrderForAlcohol = 3;
    private int numOfAlcoholDrinks = 0;
     
    public BevShop() {
    	orders = new Order[100];
    	numOrders = 0;
    }
    
    public boolean isValidTime(int time) 
    {
        return (time >= 8 && time <= 23);
    }
    
    public int getMaxNumOfFruits() 
    {
        return maxNumOfFruits;
    }
    
    public int getMinAgeForAlcohol() 
    {
        return minAgeForAlcohol;
    }
    //return true if maximum exceeded
    public boolean isMaxFruit(int numOfFruits) 
    {
        return (numOfFruits > maxNumOfFruits);
    }
    
    public int getMaxOrderForAlcohol() 
    {
        return maxOrderForAlcohol;
    }
    //return TRUE if current drinks is TOO MUCH
    public boolean isEligibleForMore() 
    {
        return (numOfAlcoholDrinks < maxOrderForAlcohol);
    }
    
    public int getNumOfAlcoholDrink() 
    {
        return numOfAlcoholDrinks;
    }
    //return TRUE if adult
    public boolean isValidAge(int age) 
    {
        return (age >= minAgeForAlcohol);
    }
    
    public void startNewOrder(int time, Day day, String customerName, int customerAge) 
    {
    	if(numOrders < 100)
    	{
            Customer customer = new Customer(customerName, customerAge);
            Order order = new Order(time, day, customer);
            orders[numOrders] = order;
            numOrders++;
            System.out.println("New order started:");
            System.out.println(order);
    	}
    }
    
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        if (numOrders > 0) 
        {
            Order currentOrder = orders[numOrders - 1];
            currentOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
        }
    }
    
    public void processAlcoholOrder(String bevName, Size size) 
    {
        if (numOrders > 0) 
        {
            Order currentOrder = orders[numOrders - 1];
            currentOrder.addNewBeverage(bevName, size);
        }
    }
    
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        if (numOrders > 0) 
        {
            Order currentOrder = orders[numOrders - 1];
            currentOrder.addNewBeverage(bevName, size, numOfFruits, addProtein);
        }
    }
    
    public int findOrder(int orderNo) {
        for (int i = 0; i < numOrders; i++) 
        {
            if (orders[i].getOrderNo() == orderNo) 
                return i;
        }
        return -1;
    }
    
    public double totalOrderPrice(int orderNo) 
    {
        int index = findOrder(orderNo);
        if (index != -1)
            return orders[index].calcOrderTotal();
        
        return 0.0;
    }
    
    public double totalMonthlySale() 
    {
        double totalSale = 0.0;
        for (int i = 0; i < numOrders; i++) {
            totalSale += orders[i].calcOrderTotal();
        }
        return totalSale;
    }
    
    public int totalNumOfMonthlyOrders() {
        return numOrders;
    }
    
    public Order getCurrentOrder() 
    {
        if (numOrders > 0) 
            return orders[numOrders - 1];
        
        return null;
    }

    public Order getOrderAtIndex(int index) 
    {
        if (index >= 0 && index < numOrders) 
            return orders[index];
        
        return null;
    }

    public void sortOrders() 
    {
        for (int i = 0; i < numOrders - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < numOrders; j++) 
            {
                if (orders[j].compareTo(orders[minIndex]) < 0) 
                    minIndex = j;
            }
            Order temp = orders[i];
            orders[i] = orders[minIndex];
            orders[minIndex] = temp;
        }
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Orders:\n");
        for (int i = 0; i < numOrders; i++) 
            sb.append(orders[i]).append("\n");
        
        sb.append("Total Monthly Sale: $").append(totalMonthlySale());
        return sb.toString();
    }


}