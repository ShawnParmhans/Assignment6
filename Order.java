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
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> 
{
    private int orderNumber;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private List<Beverage> beverages;

    public Order(int orderTime, Day orderDay, Customer customer) {
        this.orderNumber = getOrderNo();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = customer;
        this.beverages = new ArrayList<>();
    }

    public int generateOrder() 
    {
        Random random = new Random();
        return random.nextInt(80001) + 10000;
    }

    public int getOrderNo() 
    {
        return orderNumber;
    }

    public int getOrderTime() 
    {
        return orderTime;
    }

    public Day getOrderDay() 
    {
        return orderDay;
    }

    public Customer getCustomer() 
    {
        return new Customer(customer.getName(), customer.getAge());
    }

    public Day getDay() 
    {
        return orderDay;
    }

    @Override
    public boolean isWeekend() 
    {
        return (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY);
    }
    public Beverage getBeverage(int itemNo) 
    {
        if (itemNo >= 0 && itemNo < beverages.size()) 
            return beverages.get(itemNo);
        
        return null;
    }

    public int getTotalItems() 
    {
        return beverages.size();
    }

    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        Coffee coffee = new Coffee(bevName, size, extraShot, extraSyrup);
        beverages.add(coffee);
    }

    public void addNewBeverage(String bevName, Size size) 
    {
        Alcohol alcohol = new Alcohol(bevName, size);
        beverages.add(alcohol);
    }

    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) 
    {
        Smoothie smoothie = new Smoothie(bevName, size, numOfFruits, addProtein);
        beverages.add(smoothie);
    }

    public double calcOrderTotal() 
    {
        double total = 0.0;
        for (Beverage beverage : beverages) 
            total += beverage.calcPrice();
        
        return total;
    }
 
    public int findNumOfBeveType(Type type) 
    {
        int count = 0;
        for (Beverage beverage : beverages) 
        {
            if (beverage.getType() == type)
                count++;
        }
        return count;
    }
    
    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Number: ").append(getOrderNo()).append("\n");
        sb.append("Order Time: ").append(orderTime).append("\n");
        sb.append("Order Day: ").append(orderDay).append("\n");
        sb.append("Customer: ").append(customer).append("\n");
        sb.append("Beverages:\n");
        for (Beverage beverage : beverages) 
            sb.append(beverage).append("\n");
        
        return sb.toString();
    }

    @Override
    public int compareTo(Order other) 
    {
        return (Integer.compare(getOrderNo(), other.getOrderNo()));
    }
}