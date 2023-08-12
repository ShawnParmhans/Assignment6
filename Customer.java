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

public class Customer 
{
    private String name;
    private int age;
    
    //constructor
    public Customer(String n, int a) 
    {
        name = n;
        age = a;
    }
    //Copy 
    public Customer(Customer rando) 
    {
        name = rando.name;
        age = rando.age;
    }
    //toString 
    @Override
    public String toString() 
    {
        return "Customer: " + name + "\nAge: " + age;
    }
    //Getters/setters
    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

}