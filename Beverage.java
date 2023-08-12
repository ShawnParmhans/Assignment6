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

public abstract class Beverage 
{
	private String BevName;
	private Type BevType;
	private Size BevSize;
	public final static double BASE_PRICE = 2.0;
	public final double SIZE_UP = 1.0;
	//constructors
	public Beverage(String n, Type t, Size s) 
	{
		BevName = n;
		BevType = t;
		BevSize = s;
	}
	public abstract double calcPrice();
	 
	public String toString() {
		return BevName + ", " + BevSize;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Beverage bev2 = (Beverage) obj;
	    return (BevName.equals(bev2.BevName) && BevType == bev2.BevType &&
	    		BevSize == bev2.BevSize);
	}
	//getters
	public String getBevName() 
	{
		return BevName;
	}

	public Type getType() 
	{
		return BevType;
	}

	public Size getSize() 
	{
		return BevSize;
	}
	//setters
	public void setName(String n) 
	{
		BevName = n;
	}

	public void setType(Type t) 
	{
		BevType = t;
	}

	public void setSize(Size s) 
	{
		BevSize = s;
	}
}
